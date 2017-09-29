package com.codebyjpc.useraccount.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nuid_profile")
public class NuidProfile {
	@Id
	@Column
	private java.lang.Integer pkNuidProfile;
	
	@Column
	private String nuid;
	
	@Column
	private String nuidName;
	
	@Column
	private String status;
	
	@Column
	private String environment;
	
	@Column
	private String profileType;
	
	@Column
	private Date profileExpDate;
	
	@Column
	private String ownerId;
	
	@Column
	private String ownerName;
	
	@Column
	private String managerId;
	
	@Column
	private String managerName;
	
	@Column
	private String directorId;
	
	@Column
	private String directorName;
	
	@Column
	private String vpId;
	
	@Column
	private String vpName;
	
	@Column
	private String appCode;
	
	@Column
	private String assetId;
	
	@Column
	private String assetName;
	
	@Column
	private String businessUnit;
	
	@Column
	private String division;
	
	@Column
	private String costCenter;
	
	@Column
	private String operationalRisk;
	
	@Column
	private Integer financialReporting;
	
	@Column
	private Integer privileged;
	
	@Column
	private Integer shared;
	
	@Column
	private String sharedMembers;
	
//	@OneToMany(mappedBy="nuidProfile",cascade=CascadeType.ALL)
//	List<LdapData> LdapData;

	public java.lang.Integer getPkNuidProfile() {
		return pkNuidProfile;
	}

	public void setPkNuidProfile(java.lang.Integer pkNuidProfile) {
		this.pkNuidProfile = pkNuidProfile;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getProfileType() {
		return profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public Date getProfileExpDate() {
		return profileExpDate;
	}

	public void setProfileExpDate(Date profileExpDate) {
		this.profileExpDate = profileExpDate;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getDirectorId() {
		return directorId;
	}

	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getVpId() {
		return vpId;
	}

	public void setVpId(String vpId) {
		this.vpId = vpId;
	}

	public String getVpName() {
		return vpName;
	}

	public void setVpName(String vpName) {
		this.vpName = vpName;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getOperationalRisk() {
		return operationalRisk;
	}

	public void setOperationalRisk(String operationalRisk) {
		this.operationalRisk = operationalRisk;
	}

	public Integer getFinancialReporting() {
		return financialReporting;
	}

	public void setFinancialReporting(Integer financialReporting) {
		this.financialReporting = financialReporting;
	}

	public Integer getPrivileged() {
		return privileged;
	}

	public void setPrivileged(Integer privileged) {
		this.privileged = privileged;
	}

	public Integer getShared() {
		return shared;
	}

	public void setShared(Integer shared) {
		this.shared = shared;
	}

	public String getSharedMembers() {
		return sharedMembers;
	}

	public void setSharedMembers(String sharedMembers) {
		this.sharedMembers = sharedMembers;
	}
	
	

}
