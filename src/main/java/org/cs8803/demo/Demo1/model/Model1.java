package org.cs8803.demo.Demo1.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Model1 {
	private Long id;
	private String message;
	private String name;
	private Date time;
	public Model1(){
		
	}
	public Model1(Long id_, String message_, String name_){
		this.id=id_;
		this.message=message_;
		this.name=name_;
		this.time=new Date();		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
