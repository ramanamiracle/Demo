package com.tcs.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.Action;

public class DownloadAction implements Action 
{
        private InputStream fileInputStream;
        private String fileName;
        String error;
        
        public InputStream getFileInputStream() 
        {
                return fileInputStream;
        }

        public String execute() throws Exception 
        {
        		try{
                fileName = "tata.pdf";
                fileInputStream = new FileInputStream(new File("D:/" + fileName));
                return SUCCESS;
        		}
                catch(Exception e)
                {
                	setError(e.getMessage());
                	return ERROR;
                }
        }

        public String getFileName() 
        {
                return fileName;
        }

        public void setFileName(String fileName) 
        {
                this.fileName = fileName;
        }

		public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}       
}