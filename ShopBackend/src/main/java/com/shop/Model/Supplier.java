package com.shop.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	String sid;
	String sname,sdesc;
	public String getSid() {
		return sid;
	}
	public void setScid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdesc() {
		return sdesc;
	}
	public void setSdesc(String sdesc) {
		this.sdesc = sdesc;
	}

}
