package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	//db접속 
	
	//db driver, url, user, password
	
	// com.mysql.cj.jdbc.Driver
	//url - jdbc:mysql://localhost:3306/db명
	
	
	/*
	 * Name:  Local instance MySQL80 
Host: localhost 
Port: 3306 
Login User: root 
Current User: root@localhost 
SSL cipher: SSL not used 
Server 
Product: MySQL Community Server - GPL 
Version: 8.0.28 
Connector 
Version: C++ 8.0
	 * 
	 * */
	
	private static DatabaseConnection dbc = new DatabaseConnection();
	private Connection conn = null;
	private String jdbcDriver="com.mysql.cj.jdbc.Driver";
	private String jdbcUrl="jdbc:mysql://localhost:3306/javadb";
	
	
	
	//생성자
	
	private DatabaseConnection() {
		try {
			Class.forName(jdbcDriver); // 드라이버를 로드하기 위해 사용되는 메서드
			//url user password
			conn = DriverManager.getConnection(jdbcUrl,"javauser","wkqthf!324");
			
		}catch(ClassNotFoundException e) { //클래스를 못찾았다
			System.out.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
			
		}catch(SQLException e) {
			System.out.println("연결정보가 정확하지 않습니다.");
			e.printStackTrace();
			
		}
	}
	
	public static DatabaseConnection getInstance() {
		return dbc;
	}
	public Connection getConnection() {
		return conn;
	}

}


