package com.notgotoby.singleton.enums;

import java.sql.Connection;

public class MyObjectClass {
	
	public static Connection getConnection(){
		return MyObject.connectionFactory.getConnection();
	}
}
