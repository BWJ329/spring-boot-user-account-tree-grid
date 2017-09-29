package com.codebyjpc.useraccount.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codebyjpc.useraccount.model.DatatreeResult;


public interface DataTreeResultRepository extends CrudRepository<DatatreeResult ,Long> {
	
//	@Query(value = "select  npr.nuid,npr.nuid_name,npr.platform,npr.password_data_server,npr.password_reset_date,npr.password_expiry_date, npr.Change_INFO, npr.shared_members from DataTreeResults npr where  npr.manager_id = ? order by nuid,platform ",nativeQuery = true)
	List<DatatreeResult> findByManagerIdOrderByNuidAsc(String managerID);

	List<DatatreeResult> findByOwnerIdAndManagerIdOrderByNuidAsc(String owner_id, String managerID);
	
}