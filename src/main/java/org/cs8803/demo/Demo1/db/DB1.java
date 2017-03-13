package org.cs8803.demo.Demo1.db;

import java.util.HashMap;
import java.util.Map;

import org.cs8803.demo.Demo1.model.Model1;

public class DB1 {
	private static Map<Long, Model1> message=new HashMap<>();

	public static Map<Long, Model1> getMessage() {
		return message;
	}

	public static void setMessage(Map<Long, Model1> message) {
		DB1.message = message;
	}
	
}
