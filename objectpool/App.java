package com.example.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
	public static void main(String[] args) throws Exception{
		ObjectPool<Connection> objectPool=new JDBCConnectionPool("OracleDriverName","dsn", "userName", "password");
		objectPool.checkOut();//taking the object
		objectPool.checkIn(DriverManager.getConnection("dsn", "usr", "pwd"));//releasing the object
	}

}
