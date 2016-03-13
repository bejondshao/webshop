package com.bejond.webshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by bejond on 3/24/16.
 */

@Entity (name = "Security_")
public class Security {
	private long securityId;
	private long userId;
	private String reminderQuestion1;
	private String reminderQuestion2;
	private String reminderQuestion3;
	private String reminderAnswer1;
	private String reminderAnswer2;
	private String reminderAnswer3;
	private String identity;
	private Date createDate;
	private Date modifiedDate;

	@Id
	@GeneratedValue
	public long getSecurityId() {
		return securityId;
	}

	public void setSecurityId(long securityId) {
		this.securityId = securityId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getReminderQuestion1() {
		return reminderQuestion1;
	}

	public void setReminderQuestion1(String reminderQuestion1) {
		this.reminderQuestion1 = reminderQuestion1;
	}

	public String getReminderQuestion2() {
		return reminderQuestion2;
	}

	public void setReminderQuestion2(String reminderQuestion2) {
		this.reminderQuestion2 = reminderQuestion2;
	}

	public String getReminderQuestion3() {
		return reminderQuestion3;
	}

	public void setReminderQuestion3(String reminderQuestion3) {
		this.reminderQuestion3 = reminderQuestion3;
	}

	public String getReminderAnswer1() {
		return reminderAnswer1;
	}

	public void setReminderAnswer1(String reminderAnswer1) {
		this.reminderAnswer1 = reminderAnswer1;
	}

	public String getReminderAnswer2() {
		return reminderAnswer2;
	}

	public void setReminderAnswer2(String reminderAnswer2) {
		this.reminderAnswer2 = reminderAnswer2;
	}

	public String getReminderAnswer3() {
		return reminderAnswer3;
	}

	public void setReminderAnswer3(String reminderAnswer3) {
		this.reminderAnswer3 = reminderAnswer3;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
