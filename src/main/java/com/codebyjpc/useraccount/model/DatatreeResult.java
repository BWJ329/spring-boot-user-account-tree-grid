package com.codebyjpc.useraccount.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datatreeresults")
public class DatatreeResult {
	
	@Id
    @Column(name = "rownum")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long rownum;
	
	@Column
	private String nuid;
	
	@Column
	private String nuidName;

	@Column
	private String platform;
	
	@Column
	private String password_data_server;
	
	@Column
	private String password_reset_date;

	@Column
	private String password_expiry_date;

	@Column
	private String environment;

	@Column
	private String profile_type;

	@Column
	private String ownerId;
	
	@Column
	private String owner_name;
	
	@Column
	private String managerId;

	@Column
	private String manager_name;

	@Column
	private String director_id;

	@Column
	private String director_name;

	@Column
	private String shared_id;

	@Column
	private String shared_members;

	@Column
	private String asset_id;
	
	@Column
	private String asset_name;

	@Column
	private String operational_risk;

	@Column
	private String lastupdatedate;
	
	@Column
	private String Change_INFO;

	public Long getRownum() {
		return rownum;
	}

	public void setRownum(Long rownum) {
		this.rownum = rownum;
	}

	public String getNuid() {
		return nuid;
	}

	public void setNuid(String nuid) {
		this.nuid = nuid;
	}

	public String getNuidName() {
		return nuidName;
	}

	public void setNuidName(String nuidName) {
		this.nuidName = nuidName;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPassword_data_server() {
		return password_data_server;
	}

	public void setPassword_data_server(String password_data_server) {
		this.password_data_server = password_data_server;
	}

	public String getPassword_reset_date() {
		return password_reset_date;
	}

	public void setPassword_reset_date(String password_reset_date) {
		this.password_reset_date = password_reset_date;
	}

	public String getPassword_expiry_date() {
		return password_expiry_date;
	}

	public void setPassword_expiry_date(String password_expiry_date) {
		this.password_expiry_date = password_expiry_date;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getProfile_type() {
		return profile_type;
	}

	public void setProfile_type(String profile_type) {
		this.profile_type = profile_type;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	
	

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getDirector_id() {
		return director_id;
	}

	public void setDirector_id(String director_id) {
		this.director_id = director_id;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public String getShared_id() {
		return shared_id;
	}

	public void setShared_id(String shared_id) {
		this.shared_id = shared_id;
	}

	public String getShared_members() {
		return shared_members;
	}

	public void setShared_members(String shared_members) {
		this.shared_members = shared_members;
	}

	public String getAsset_id() {
		return asset_id;
	}

	public void setAsset_id(String asset_id) {
		this.asset_id = asset_id;
	}

	public String getAsset_name() {
		return asset_name;
	}

	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}

	public String getOperational_risk() {
		return operational_risk;
	}

	public void setOperational_risk(String operational_risk) {
		this.operational_risk = operational_risk;
	}

	public String getLastupdatedate() {
		return lastupdatedate;
	}

	public void setLastupdatedate(String lastupdatedate) {
		this.lastupdatedate = lastupdatedate;
	}

	public String getChange_INFO() {
		return Change_INFO;
	}

	public void setChange_INFO(String change_INFO) {
		Change_INFO = change_INFO;
	}
	
	

}
