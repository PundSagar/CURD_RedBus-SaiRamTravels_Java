package com.cjc.crud.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SaiRamtravells 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int sid;
private String sname;
private String sfrom;
private String sto;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSfrom() {
	return sfrom;
}
public void setSfrom(String sfrom) {
	this.sfrom = sfrom;
}
public String getSto() {
	return sto;
}
public void setSto(String sto) {
	this.sto = sto;
}
}
