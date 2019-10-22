/**
 * 
 */
package com.user.models;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

import com.expenditure.commons.enums.ExpenseType;

/**
 * @author bharath.kk
 *
 */
public class User {

	private String userId;
	private String userName;
	private Date CreatedOn;
	private Date modifiedon;
	private String createdBy;
	private BigDecimal totalSalary;
	private Date salaryDate;
	private Address address;
	private String phone;
	private String email;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return CreatedOn;
	}

	/**
	 * @param createdOn
	 *            the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}

	/**
	 * @return the modifiedon
	 */
	public Date getModifiedon() {
		return modifiedon;
	}

	/**
	 * @param modifiedon
	 *            the modifiedon to set
	 */
	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the totalSalary
	 */
	public BigDecimal getTotalSalary() {
		return totalSalary;
	}

	/**
	 * @param totalSalary
	 *            the totalSalary to set
	 */
	public void setTotalSalary(BigDecimal totalSalary) {
		this.totalSalary = totalSalary;
	}

	/**
	 * @return the salaryDate
	 */
	public Date getSalaryDate() {
		return salaryDate;
	}

	/**
	 * @param salaryDate
	 *            the salaryDate to set
	 */
	public void setSalaryDate(Date salaryDate) {
		this.salaryDate = salaryDate;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
