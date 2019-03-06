package com.lc.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "PRODUCT")
public class ProductModel {

	@Id
	@Column(name="Product_Code")
	private String code;
	
	@Column(name="Product_Type")
	private String productType;
	
	@Column(name="Product_Name")
	private String name;
	
	@Column(name="Product_Description")
	private String discription;
	
	@Column(name="Product_Unit")
	private Integer unit;
	
	@Column(name="Product_Availablity")
	private String availablity;
	
	@Column(name="Product_AvailablityDate")
	private Date availablityDate;
	
	@Column(name="Product_Size")
	private String size;
	
	@Column(name="Product_Color")
	private String color;
}
