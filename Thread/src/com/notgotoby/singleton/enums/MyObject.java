package com.notgotoby.singleton.enums;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 使用枚举完成了单例模式，但是将枚举类暴露了，违反“职责单一原则”
 * @author notogoby
 *
 */
public enum MyObject {
	connectionFactory;
	
	private Connection connection;
	private MyObject() {
		try {
			System.out.println("调用了MyObject构造器");
			String url = "jdbc:mysql://127.0.0.1:3306/mydatabase?useUnicode=true&amp;characterEncoding=utf-8";
			String username = "liucb";
			String password = "admin";
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		return connection;
	}

}
