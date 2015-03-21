package com.tcs.action;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tcs.beans.UserDetails;
import com.tcs.dao.*;



public class UserAction extends ActionSupport implements ModelDriven<UserDetails> {

	private static final long serialVersionUID = -6659925652584240539L;
	private static final Logger LOGGER = Logger.getLogger(UserAction.class);

	private UserDetails user = new UserDetails();
	private List<UserDetails> userList = new ArrayList<UserDetails>();
	private UserDao userDAO = new UserDao();
	
	@Override
	public UserDetails getModel() {
		return user;
	}
	
	public String saveOrUpdate()
	{	
		userDAO.saveOrUpdateUser(user);
		return SUCCESS;
	}
	
	
	public String list()
	{
		userList = userDAO.listUser();
		return SUCCESS;
	}
	
	
	public String delete()
	{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
		userDAO.deleteUser(Long.parseLong( request.getParameter("id")));
		return SUCCESS;
	}
	
	
	public String edit()
	{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
		user = userDAO.listUserById(Long.parseLong( request.getParameter("id")));
		return SUCCESS;
	}
	
	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}

	public List<UserDetails> getUserList() {
		return userList;
	}

	public void setUserList(List<UserDetails> userList) {
		this.userList = userList;
	}
	
	  @Override
	    public void validate(){
	        LOGGER.debug("validate()...");
	        if (user.getName()==null || user.getName().length()==0){
	            addActionError(getText("error.enter.message"));
	            LOGGER.debug("vaidate(): vaidation failed because passed message is null/empty");
	        }
	    }

}
