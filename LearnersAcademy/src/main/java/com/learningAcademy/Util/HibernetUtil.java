package com.learningAcademy.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learningAcademy.Entity.User;

public class HibernetUtil {
	static SessionFactory sessionFactory=null;
	
	public static SessionFactory buildSessionFactory() {
		if(sessionFactory!=null) {
			return sessionFactory;
		}
		//S1: Create Configuration Object
		Configuration cfg=new Configuration()
				.configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
		sessionFactory=cfg.buildSessionFactory();
		
		return sessionFactory;
	}
}
