package Dreamsol.Form;

import java.util.Date;
import java.util.List;

import Dreamsol.entities.*;
public class InsertionForm {
	private String userName;
	private String mobile;
	private Date bod;
	private String pass;
	private List<Employee> e1;
	
	
	public List<Employee> getE1() {
		return e1;
	}
	public void setE1(List<Employee> e1) {
		this.e1 = e1;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getBod() {
		return bod;
	}
	public void setBod(Date bod) {
		this.bod = bod;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
