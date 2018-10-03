package com.shop.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Deal {
	
	@Id
	String dId;
	String dDesc,dDisc;
	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	public String getdDesc() {
		return dDesc;
	}
	public void setdDesc(String dDesc) {
		this.dDesc = dDesc;
	}
	public String getdDisc() {
		return dDisc;
	}
	public void setdDisc(String dDisc) {
		this.dDisc = dDisc;
	}
	
}
