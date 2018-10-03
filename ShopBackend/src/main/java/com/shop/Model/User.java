package com.shop.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	String uid;
	String uname,uemail,upwrd,ulocation;
	String umobno;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpwrd() {
		return upwrd;
	}
	public void setUpwrd(String upwrd) {
		this.upwrd = upwrd;
	}
	public String getUlocation() {
		return ulocation;
	}
	public void setUlocation(String ulocation) {
		this.ulocation = ulocation;
	}
	public String getUmobno() {
		return umobno;
	}
	public void setUmobno(String string) {
		this.umobno = string;
	}
}
