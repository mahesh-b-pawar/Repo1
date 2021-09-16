package com.insurance.persist;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.insurance.beans.Insurance;

public class DbOpreations {

	public int insert(Insurance in) {
		Configuration cfg=new Configuration();
		cfg.configure("ins.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session sess=factory.openSession();
		Transaction tx=sess.beginTransaction();
		Serializable sid=sess.save(in);
		tx.commit();
		sess.close();
		factory.close();
		
		return (int)sid;
	}

	
		

}
