package com.codebyjpc.useraccount.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ldapdata")
public class LdapData {
	
	@Id
    @Column(name = "rownum")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long rownum; 
	
	@Column
	private String uid;
	@Column
	private String cn;
	@Column
	private String employeenumber;
	@Column
	private String employeetype ;
	@Column
	private String fmbusinesscritical;
	@Column
	private String fmcostcenter;
	@Column
	private String fmemployeestatus;
	@Column
	private String fmfloor;
	@Column
	private String fmhomeserver;
	@Column
	private String fmisterminated;
	@Column
	private String fmjobLevel;
	@Column
	private String fmlegalname ;
	@Column
	private String fmofficelocation;
	@Column
	private String fmpeoplemanager;
	@Column
	private String fmregion;
	@Column
	private String initials ;
	@Column
	private String givenname;
	@Column
	private String manager ;
	@Column
	private String physicaldeliveryofficename;
	@Column
	private String roomnumber;
	@Column
	private String sn;
	@Column
	private String telephonenumber;
	@Column
	private String title;
	@Column
	private String mail;
	@Column
	private String fmmanageruid;
	@Column
	private String fmbusinessunit;
	@Column
	private String fmdivision;
	@Column
	private String fmpasswordresetdate;
	@Column
	private String mailalternateaddress;
	@Column
	private String mailhost;
	@Column
	private String fmmarketroom;
	@Column
	private String fmmanagerlevel;
	@Column
	private String fmwarningflag;
//	
//	@ManyToOne
//	@JoinTable(name="USER_GROUP")
//    private NuidProfile nuidProfile;

//	public NuidProfile getNuidProfile() {
//		return nuidProfile;
//	}
//	public void setNuidProfile(NuidProfile nuidProfile) {
//		this.nuidProfile = nuidProfile;
//	}
	public Long getRownum() {
		return rownum;
	}
	public void setRownum(Long rownum) {
		this.rownum = rownum;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getEmployeenumber() {
		return employeenumber;
	}
	public void setEmployeenumber(String employeenumber) {
		this.employeenumber = employeenumber;
	}
	public String getEmployeetype() {
		return employeetype;
	}
	public void setEmployeetype(String employeetype) {
		this.employeetype = employeetype;
	}
	public String getFmbusinesscritical() {
		return fmbusinesscritical;
	}
	public void setFmbusinesscritical(String fmbusinesscritical) {
		this.fmbusinesscritical = fmbusinesscritical;
	}
	public String getFmcostcenter() {
		return fmcostcenter;
	}
	public void setFmcostcenter(String fmcostcenter) {
		this.fmcostcenter = fmcostcenter;
	}
	public String getFmemployeestatus() {
		return fmemployeestatus;
	}
	public void setFmemployeestatus(String fmemployeestatus) {
		this.fmemployeestatus = fmemployeestatus;
	}
	public String getFmfloor() {
		return fmfloor;
	}
	public void setFmfloor(String fmfloor) {
		this.fmfloor = fmfloor;
	}
	public String getFmhomeserver() {
		return fmhomeserver;
	}
	public void setFmhomeserver(String fmhomeserver) {
		this.fmhomeserver = fmhomeserver;
	}
	public String getFmisterminated() {
		return fmisterminated;
	}
	public void setFmisterminated(String fmisterminated) {
		this.fmisterminated = fmisterminated;
	}
	public String getFmjobLevel() {
		return fmjobLevel;
	}
	public void setFmjobLevel(String fmjobLevel) {
		this.fmjobLevel = fmjobLevel;
	}
	public String getFmlegalname() {
		return fmlegalname;
	}
	public void setFmlegalname(String fmlegalname) {
		this.fmlegalname = fmlegalname;
	}
	public String getFmofficelocation() {
		return fmofficelocation;
	}
	public void setFmofficelocation(String fmofficelocation) {
		this.fmofficelocation = fmofficelocation;
	}
	public String getFmpeoplemanager() {
		return fmpeoplemanager;
	}
	public void setFmpeoplemanager(String fmpeoplemanager) {
		this.fmpeoplemanager = fmpeoplemanager;
	}
	public String getFmregion() {
		return fmregion;
	}
	public void setFmregion(String fmregion) {
		this.fmregion = fmregion;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public String getGivenname() {
		return givenname;
	}
	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getPhysicaldeliveryofficename() {
		return physicaldeliveryofficename;
	}
	public void setPhysicaldeliveryofficename(String physicaldeliveryofficename) {
		this.physicaldeliveryofficename = physicaldeliveryofficename;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getTelephonenumber() {
		return telephonenumber;
	}
	public void setTelephonenumber(String telephonenumber) {
		this.telephonenumber = telephonenumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getFmmanageruid() {
		return fmmanageruid;
	}
	public void setFmmanageruid(String fmmanageruid) {
		this.fmmanageruid = fmmanageruid;
	}
	public String getFmbusinessunit() {
		return fmbusinessunit;
	}
	public void setFmbusinessunit(String fmbusinessunit) {
		this.fmbusinessunit = fmbusinessunit;
	}
	public String getFmdivision() {
		return fmdivision;
	}
	public void setFmdivision(String fmdivision) {
		this.fmdivision = fmdivision;
	}
	public String getFmpasswordresetdate() {
		return fmpasswordresetdate;
	}
	public void setFmpasswordresetdate(String fmpasswordresetdate) {
		this.fmpasswordresetdate = fmpasswordresetdate;
	}
	public String getMailalternateaddress() {
		return mailalternateaddress;
	}
	public void setMailalternateaddress(String mailalternateaddress) {
		this.mailalternateaddress = mailalternateaddress;
	}
	public String getMailhost() {
		return mailhost;
	}
	public void setMailhost(String mailhost) {
		this.mailhost = mailhost;
	}
	public String getFmmarketroom() {
		return fmmarketroom;
	}
	public void setFmmarketroom(String fmmarketroom) {
		this.fmmarketroom = fmmarketroom;
	}
	public String getFmmanagerlevel() {
		return fmmanagerlevel;
	}
	public void setFmmanagerlevel(String fmmanagerlevel) {
		this.fmmanagerlevel = fmmanagerlevel;
	}
	public String getFmwarningflag() {
		return fmwarningflag;
	}
	public void setFmwarningflag(String fmwarningflag) {
		this.fmwarningflag = fmwarningflag;
	}
	
	
}
