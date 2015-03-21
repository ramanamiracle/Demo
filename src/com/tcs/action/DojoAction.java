package com.tcs.action;


import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
 
public class DojoAction extends ActionSupport{
 
	public List<String> webframeworks = new ArrayList<String>();
	
	public List<String> getWebframeworks() {
		return webframeworks;
	}
	public void setWebframeworks(List<String> webframeworks) {
		this.webframeworks = webframeworks;
	}
	public DojoAction()
	{
		webframeworks.add("Spring MVC");
		webframeworks.add("Struts 1.x");
		webframeworks.add("Struts 2.x");
		webframeworks.add("JavaServer Faces (JSF)");
		webframeworks.add("Google Web Toolkit (GWT)");
		webframeworks.add("Apache Wicket");
		webframeworks.add("Apache Click");
		webframeworks.add("Apache Cocoon");
		webframeworks.add("JBoss Seam");
		webframeworks.add("Stripes");
		webframeworks.add("Apache Tapestry");
		webframeworks.add("Others");
		
	}
	//business logic
	public String execute() {
		return "SUCCESS";
	}
	
	public String display() {
		return "none";
	}
	
}