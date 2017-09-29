package com.codebyjpc.useraccount.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.codebyjpc.useraccount.model.DatatreeResult;
import com.codebyjpc.useraccount.model.LdapData;
import com.codebyjpc.useraccount.repository.DataTreeResultRepository;
import com.codebyjpc.useraccount.repository.LdapDataRepository;
import com.codebyjpc.useraccount.repository.NuidProfileRepository;
import com.codebyjpc.useraccount.response.Response;

@RestController
public class AppController {
	
	@Autowired
	private LdapDataRepository ldapDataRepository;
	
	@Autowired
	private NuidProfileRepository nuidProfileRepository;

	@Autowired
	private DataTreeResultRepository dataTreeResultRepository;

	private String loginUser;

	private Boolean loginState;
	
	@RequestMapping("/")
	public ModelAndView indexView(ModelAndView modelAndView) {
		
		loginUser = "s6udet";// Display the Welcome Name in the Header page 
		loginState = true;
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value="/dashboard", method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public Response showDashboardPage(Model model){

		Long nuidCount = nuidProfileRepository.countByManagerId(loginUser);
		
		Long ownerCnt = nuidProfileRepository.getOwnerCountByLoginId(loginUser,loginUser);
		
		List<LdapData> ldapData = ldapDataRepository.findByUid(loginUser);
		
		model.addAttribute("ldapData", ldapData);
		model.addAttribute("nuidCount", nuidCount);
		model.addAttribute("ownerCnt", ownerCnt);

		return new Response(loginState, model);
		
	}
	
	@RequestMapping(value="/accountsByUser",method = RequestMethod.POST, produces = "application/json")
	@ResponseBody	
	public Response getaccountByuser(@RequestParam("uid") String uid, Model model){
		
		List<DatatreeResult> dataprofile = dataTreeResultRepository.findByManagerIdOrderByNuidAsc(uid);
		model.addAttribute("dataprofile", dataprofile);
		
		return new Response(loginState,model);

	}

	@RequestMapping(value="/checHaskOwnersList", method = RequestMethod.POST, produces ="application/json")
	@ResponseBody
	public Response checHaskOwnersList(@RequestParam("uid") String uid, Model model){

		Long ownerCnt = nuidProfileRepository.getOwnerCountByManager(uid);

		model.addAttribute("ownerCnt",ownerCnt);

		return new Response(loginState,model);
	}

	@RequestMapping(value="/getjqxDropDownListed", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public Response getjqxDropDownListed(@RequestParam("uid") String userID,Model model){
		
		String[] ownersName = nuidProfileRepository.findDistinctOwnerNameFromNuidProfileByManagerId(userID);
		
		String[] ownersID = nuidProfileRepository.findDistinctOwnerIdFromNuidProfileByManagerId(userID);

		model.addAttribute("ownersName",ownersName);
		model.addAttribute("ownersID",ownersID);
		model.addAttribute("managerID",loginUser);
		return new Response(loginState,model);
	}

	@RequestMapping(value="/getUsers",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Response getUsers(Model model){
		String[] userID= ldapDataRepository.findDistinctUidFromLdapData();
		String[] userNames=ldapDataRepository.findDistinctCnFromLdapData();
		model.addAttribute("userID",userID);
		model.addAttribute("userNames",userNames);
		return new Response(loginState,model);
	}

	@RequestMapping(value="/userSearchUserOnly",method=RequestMethod.POST)
	@ResponseBody
	public Response findUserOnly(@RequestParam("userId") String uid, Model model){
		List<DatatreeResult> dataprofile = dataTreeResultRepository.findByManagerIdOrderByNuidAsc(uid);
		return new Response(loginState,model);
	}

	@RequestMapping(value = "/searchOwenerSelected",method=RequestMethod.POST)
	@ResponseBody
	public Response findByOwenerID(@RequestParam("ownersID") String ownersID,@RequestParam("managerID") String managerID,Model model){
		ArrayList<String> condition = new ArrayList<String>();condition.add(ownersID);	
		if(!condition.contains("allowners")) {
			List<DatatreeResult> dataprofile = dataTreeResultRepository.findByOwnerIdAndManagerIdOrderByNuidAsc(ownersID,managerID);
			model.addAttribute("dataTree", dataprofile);
		} else {
			List<DatatreeResult> dataprofile = dataTreeResultRepository.findByManagerIdOrderByNuidAsc(managerID);
			model.addAttribute("dataTree", dataprofile);
		}
		return new Response(loginState,model);
	}

	@RequestMapping(value = "/checkUser",method=RequestMethod.POST)
	@ResponseBody
	public Response checkUser(@RequestParam("userID") String userID, @RequestParam("userName") String userName,Model model){

//		String[] userIDAndName = ldapDataRepository.findDistinctUidCnFromLdapData(userID,userName);
		String[] userIDAndName = ldapDataRepository.findDistinctUidCnFromLdapData(userID,userName);
		model.addAttribute("uidAndName",userIDAndName);
		return new Response(loginState,model);
	}

}
