package com.example.Lab08_PhoneList.entity;

import java.io.Serializable;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@DataAmount
public class Phone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6242818609496720407L;
	private String namePhone;
	private String price;
	public String getNamePhone() {
		return namePhone;
	}
	public void setNamePhone(String namePhone) {
		this.namePhone = namePhone;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Phone(String namePhone, String price) {
		super();
		this.namePhone = namePhone;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [namePhone=" + namePhone + ", price=" + price + "]";
	}
	
}
