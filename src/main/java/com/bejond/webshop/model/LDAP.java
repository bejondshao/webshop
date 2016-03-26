package com.bejond.webshop.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by bejond on 3/26/16.
 */

@Component
@Entity (name = "LDAP_")
public class LDAP {
	private long LDAPId;
	private long userId;
	private String name;
	private String description;
	private String providerURL;
	private String baseDN;
	private String principal;
	private String credentials;
	private String authenticationSearchFilter;
	private String importUserSearchFilter;
	private String screenNameMapping;
	private String emailMapping;
	private String passwordMapping;
	private String firstNameMapping;
	private String lastNameMapping;
	private String titleMapping;
	private String statusMapping;
	private String groupMapping;
	private String portraitMapping;
	private String customUserMapping;
	private String customContactMapping;
	private String importGroupSearchFilter;
	private String groupNameMapping;
	private String groupDescriptionMapping;
	private String groupUser;
	private String exportUserDN;
	private String userDefaultObjectClasses;
	private String groupDN;
	private String groupDefaultObjectClasses;

	@Id
	@GeneratedValue
	public long getLDAPId() {
		return LDAPId;
	}

	public void setLDAPId(long LDAPId) {
		this.LDAPId = LDAPId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProviderURL() {
		return providerURL;
	}

	public void setProviderURL(String providerURL) {
		this.providerURL = providerURL;
	}

	public String getBaseDN() {
		return baseDN;
	}

	public void setBaseDN(String baseDN) {
		this.baseDN = baseDN;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public String getAuthenticationSearchFilter() {
		return authenticationSearchFilter;
	}

	public void setAuthenticationSearchFilter(String authenticationSearchFilter) {
		this.authenticationSearchFilter = authenticationSearchFilter;
	}

	public String getImportUserSearchFilter() {
		return importUserSearchFilter;
	}

	public void setImportUserSearchFilter(String importUserSearchFilter) {
		this.importUserSearchFilter = importUserSearchFilter;
	}

	public String getScreenNameMapping() {
		return screenNameMapping;
	}

	public void setScreenNameMapping(String screenNameMapping) {
		this.screenNameMapping = screenNameMapping;
	}

	public String getEmailMapping() {
		return emailMapping;
	}

	public void setEmailMapping(String emailMapping) {
		this.emailMapping = emailMapping;
	}

	public String getPasswordMapping() {
		return passwordMapping;
	}

	public void setPasswordMapping(String passwordMapping) {
		this.passwordMapping = passwordMapping;
	}

	public String getFirstNameMapping() {
		return firstNameMapping;
	}

	public void setFirstNameMapping(String firstNameMapping) {
		this.firstNameMapping = firstNameMapping;
	}

	public String getLastNameMapping() {
		return lastNameMapping;
	}

	public void setLastNameMapping(String lastNameMapping) {
		this.lastNameMapping = lastNameMapping;
	}

	public String getTitleMapping() {
		return titleMapping;
	}

	public void setTitleMapping(String titleMapping) {
		this.titleMapping = titleMapping;
	}

	public String getStatusMapping() {
		return statusMapping;
	}

	public void setStatusMapping(String statusMapping) {
		this.statusMapping = statusMapping;
	}

	public String getGroupMapping() {
		return groupMapping;
	}

	public void setGroupMapping(String groupMapping) {
		this.groupMapping = groupMapping;
	}

	public String getPortraitMapping() {
		return portraitMapping;
	}

	public void setPortraitMapping(String portraitMapping) {
		this.portraitMapping = portraitMapping;
	}

	public String getCustomUserMapping() {
		return customUserMapping;
	}

	public void setCustomUserMapping(String customUserMapping) {
		this.customUserMapping = customUserMapping;
	}

	public String getCustomContactMapping() {
		return customContactMapping;
	}

	public void setCustomContactMapping(String customContactMapping) {
		this.customContactMapping = customContactMapping;
	}

	public String getImportGroupSearchFilter() {
		return importGroupSearchFilter;
	}

	public void setImportGroupSearchFilter(String importGroupSearchFilter) {
		this.importGroupSearchFilter = importGroupSearchFilter;
	}

	public String getGroupNameMapping() {
		return groupNameMapping;
	}

	public void setGroupNameMapping(String groupNameMapping) {
		this.groupNameMapping = groupNameMapping;
	}

	public String getGroupDescriptionMapping() {
		return groupDescriptionMapping;
	}

	public void setGroupDescriptionMapping(String groupDescriptionMapping) {
		this.groupDescriptionMapping = groupDescriptionMapping;
	}

	public String getGroupUser() {
		return groupUser;
	}

	public void setGroupUser(String groupUser) {
		this.groupUser = groupUser;
	}

	public String getExportUserDN() {
		return exportUserDN;
	}

	public void setExportUserDN(String exportUserDN) {
		this.exportUserDN = exportUserDN;
	}

	public String getUserDefaultObjectClasses() {
		return userDefaultObjectClasses;
	}

	public void setUserDefaultObjectClasses(String userDefaultObjectClasses) {
		this.userDefaultObjectClasses = userDefaultObjectClasses;
	}

	public String getGroupDN() {
		return groupDN;
	}

	public void setGroupDN(String groupDN) {
		this.groupDN = groupDN;
	}

	public String getGroupDefaultObjectClasses() {
		return groupDefaultObjectClasses;
	}

	public void setGroupDefaultObjectClasses(String groupDefaultObjectClasses) {
		this.groupDefaultObjectClasses = groupDefaultObjectClasses;
	}
}
