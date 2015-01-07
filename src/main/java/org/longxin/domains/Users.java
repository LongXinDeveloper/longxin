package org.longxin.domains;

// Generated 2014-12-18 21:55:02 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.longxin.util.Roles;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "longxin")
public class Users implements java.io.Serializable {

	private static final long serialVersionUID = -2491739765791697998L;
	
	private Integer id;
	private String username;
	private String password;
	private Date createdat;
	private Roles role;
	private Department department;
	private String passwordAgain;

	public Users() {
	}

	public Users(String username, Date createdat, Roles role) {
		this.username = username;
		this.createdat = createdat;
		this.role = role;
	}

	public Users(String username, String password, Date createdat, Roles role) {
		this.username = username;
		this.password = password;
		this.createdat = createdat;
		this.role = role;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "USERNAME", nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 256)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATEDAT", nullable = false, length = 19)
	public Date getCreatedat() {
		return this.createdat;
	}

	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}

	@Enumerated(EnumType.STRING)
	public Roles getRole() {
		return this.role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPARTMENT")
	public Department getDepartment()
	{
		return this.department;
	}

	public void setDepartment(Department department)
	{
		this.department = department;
	}

	@Transient
	public String getPasswordAgain()
	{
		return passwordAgain;
	}

	public void setPasswordAgain(String passwordAgain)
	{
		this.passwordAgain = passwordAgain;
	}
	
}