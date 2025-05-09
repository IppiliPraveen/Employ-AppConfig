package com.employ.app.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="emp_dtl_tb")
public class Employ {
	
	@Id
	@Column(name="e_emp_id")
	private String empId;
	
	@Column(name="e_nam") 	
	@Nonnull
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name="e_gender")
	@Nonnull
	private Gender gender;
	
	@Column(name="e_dept")
	@Nonnull
	private String dept;
	
	@Column(name="e_desig")
	@Nonnull
	private String desig;
	
	@Column(name="e_basic")
	@Nonnull
	private Long salary;
	
	@Column(name="e_status")
	@Nonnull
	private String status;
	
}
