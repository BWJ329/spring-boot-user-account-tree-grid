package com.codebyjpc.useraccount.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codebyjpc.useraccount.model.NuidProfile;


public interface NuidProfileRepository extends CrudRepository<NuidProfile, Long> {
	
	@Query(value = "select count(*) from (select distinct owner_id from NUID_Profile np where (np.manager_id =?1 or np.owner_id=?2)) as x ", nativeQuery = true)
	public Long getOwnerCountByLoginId(String id, String id1);
	
	@Query(value = "select count(*) from (select distinct owner_id from NUID_Profile np where (np.manager_id =?1)) as x", nativeQuery = true)
	public Long countByManagerId(String loginUser);

	@Query(value = "select count(distinct np.owner_id) from NUID_Profile np   where np.manager_id= ?1 ", nativeQuery = true)
	public Long getOwnerCountByManager(String loginUser);

	List<NuidProfile> findDistinctBymanagerId(String loginUser);

	List<NuidProfile> findOwnerIdOwnerNameDistinctByManagerId(String loginUser);

	@Query(value = " SELECT DISTINCT np.ownerName FROM NuidProfile np WHERE np.managerId= ?1 ORDER BY np.ownerName")
	public String[] findDistinctOwnerNameFromNuidProfileByManagerId(String loginUser);
	
	@Query(value = " SELECT DISTINCT np.ownerId FROM NuidProfile np WHERE np.managerId= ?1 ORDER BY np.ownerName")
	public String[] findDistinctOwnerIdFromNuidProfileByManagerId(String loginUser);
}
