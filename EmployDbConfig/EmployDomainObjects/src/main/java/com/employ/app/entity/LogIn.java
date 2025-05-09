package com.employ.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emp_login_tb")
public class LogIn {
	
	@Id
	@Column(name="l_user_id")
	private String userId;
	
	@Column(name="l_pswd")
	private String password;
	
	@Column(name="l_acs_ty")
	private String access;

}
