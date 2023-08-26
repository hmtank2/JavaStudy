package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		String resource = "com/config/Configuration.xml";
		
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
	}	

	public static SqlSession getSession() {
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}
}

