/**
 * 
 */
package com.gcit.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ppradhan
 *
 */

@Entity
@Table(name = "tbl_library_branch", catalog = "library")
public class LibraryBranch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer branchId;
	
	@Column(name = "branchName")
	private String branchName;
	
	@Column(name = "branchAddress")
	private String branchAddress;

	/**
	 * @return the BranchId
	 */
	public Integer getBranchId() {
		return branchId;
	}

	/**
	 * @param BranchId the BranchId to set
	 */
	public void setBranchId(Integer LibraryBranchId) {
		this.branchId = LibraryBranchId;
	}

	/**
	 * @return the BranchName
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * @param BranchName the authorName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String address) {
		this.branchAddress = address;
	}
}
