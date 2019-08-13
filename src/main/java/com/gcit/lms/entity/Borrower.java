/**
 * 
 */
package com.gcit.lms.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "tbl_borrower", catalog = "library")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="cardNo", scope = Borrower.class)
public class Borrower {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cardNo;
	
	@Column(name = "name", nullable = false, unique = true, length = 45)
	private String name;

	@Column(name = "address", length = 45)
	private String address;

	@Column(name = "phone", length = 45)
	private String phone;
	
	
	//private List<Book> booksBorrowed;

	/**
	 * @return the borrowerId
	 */
	public Integer getCardNo() {
		return cardNo;
	}

	/**
	 * @param borrowerId the borrowerId to set
	 */
	public void setCardNo(Integer borrowerId) {
		this.cardNo = borrowerId;
	}

	/**
	 * @return the borrowerName
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param borrowerName the borrowerName to set
	 */
	public void setName(String borrowerName) {
		this.name = borrowerName;
	}

	/**
	 * @return the borrowerAddress
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param borrowerAddress the borrowerAddress to set
	 */
	public void setAddress(String borrowerAddress) {
		this.address = borrowerAddress;
	}

	/**
	 * @return the borrowerPhone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param borrowerPhone the borrowerPhone to set
	 */
	public void setPhone(String borrowerPhone) {
		this.phone = borrowerPhone;
	}

}
