package Dreamsol.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opensymphony.xwork2.inject.Scope.Strategy;

@Entity
@Table( name= "Employee" )
public class Employee implements Serializable{
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int Id;
	
     @Column(name="userName")
     private String userName;
   @Column(name="mobile")
    private String mobile;

  @Column(name="bod")
    private Date bod;

   @Column(name="pass")
    private String pass;


public String getUserName() {
	return userName;
}
public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
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
