package com.codebyjpc.useraccount.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codebyjpc.useraccount.model.LdapData;

public interface LdapDataRepository extends CrudRepository<LdapData ,Long>{

	List<LdapData> findByUid(String uid);
	
	@Query(value = "SELECT DISTINCT ld.uid FROM LdapData ld ORDER BY ld.cn")
	String[] findDistinctUidFromLdapData();
	
	@Query(value = "SELECT DISTINCT ld.cn FROM LdapData ld ORDER BY ld.cn")
	String[] findDistinctCnFromLdapData();
	
	@Query(value = "SELECT DISTINCT uid,cn FROM LdapData ld WHERE ld.uid like ?1 OR ld.cn like ?2")
	String[] findDistinctUidCnFromLdapData(String userID, String userName);
	
//	@Query(value = "SELECT DISTINCT uid,cn FROM LdapData ld LEFT JOIN ld.nuidProfile np ON np.manager_id = ld.uid AND ld.uid = np.manager_id WHERE ld.fmIsTerminated='No' AND ld.employeeType IN('Employee','Contractor') AND ((LOWER(ld.cn) LIKE ('Diane Tran') AND LOWER(np.manager_name) LIKE ('Diane Tran')) OR (LOWER(ld.uid) LIKE ('%s6udet%') AND LOWER(np.manager_id) LIKE ('%s6udet%')))")
//	String[] findDistinctUidFromLadpData();


}
