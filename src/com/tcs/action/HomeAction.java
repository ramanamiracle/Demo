package com.tcs.action;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	/**
	 * Home Action to navigate Authorized Agent Module
	 */
	private static final long serialVersionUID = 1L;
	private String sysdate;
	private Date date;

	private Map<String, Object> session;
	private Map<String, String> choices = new HashMap<String, String>();
	
	public Map<String, Object> getSession() {
		return session;
	}

	public HomeAction() {
		date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sysdate = sdf.format(date);
	}

	public String execute() {
		session.put("sysdate", sysdate);
		choices.put("download", "Download Empty Template File");
		choices.put("upload", "Upload XML File");
		choices.put("process", "Process uploaded File");
			return "aallhome";
	}
	
	public Map<String, String> getChoices(){
		return choices;
	}
	
	public String getDefaultAgentChoice(){
		return "download";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setChoices(Map<String, String> choices) {
		this.choices = choices;
	}

}
