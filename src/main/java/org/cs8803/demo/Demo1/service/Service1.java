package org.cs8803.demo.Demo1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.cs8803.demo.Demo1.db.DB1;
import org.cs8803.demo.Demo1.model.Model1;

public class Service1 {
	Map<Long, Model1>messages = DB1.getMessage();
	
	public Service1(){
		messages.put(1L, new Model1(1L, "message 1", "name 1"));
		messages.put(2L, new Model1(2L, "message 2", "name 2"));
	}
	
	public List<Model1> getAllMessages(){
		return new  ArrayList<Model1>(messages.values());		
	}
	
	public Model1 getMessage(long id){
		return messages.get(id);
	}
	
	public Model1 addMessage(Model1 message){
		message.setId((long) (messages.size()+1));
		messages.put(message.getId(), message);
		return message;
	}
	
	public Model1 updateMessage(Model1 message){
		messages.put(message.getId(), message);
		return message;
	}
	
	public Model1 remMessage(long id){
		return messages.remove(id);
	}	
}