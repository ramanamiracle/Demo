package com.tcs.action;

import java.util.ArrayList;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpSession;

public class LoginAction extends ActionSupport{

	String username;
	String password;
	ArrayList<String> countryList;
	
	public LoginAction()
	{
		countryList = new ArrayList<String>();
		countryList.add ("India");
		countryList.add ("US");
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		
	}
	
	public ArrayList<String> getCountryList() {
		return countryList;
	}

	public void setCountryList(ArrayList<String> countryList) {
		this.countryList = countryList;
	}

	public String execute()
	{
		/*
		if (this.username.equals("admin") && this.password.equals("admin")) {
			return "success";
		} else {
			addActionError(getText("error.login"));
         	return "error";
		}
		*/
		return "data";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void validate(){
		if("".equals(getUsername())){
			addFieldError("username", getText("username.required"));
		}
		if("".equals(getPassword())){
			addFieldError("password", getText("password.required"));
		}
	}
	
	public String authenticate()
	{
		return "success";
	}
	
}
