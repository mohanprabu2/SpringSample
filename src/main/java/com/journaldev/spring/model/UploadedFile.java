package com.journaldev.spring.model;

import java.io.Serializable;

public class UploadedFile implements Serializable{
	 
	private static final long serialVersionUID = -7788619177798333712L;
	
    public int length;
    public byte[] bytes;
    public String name;
    public String type;
}