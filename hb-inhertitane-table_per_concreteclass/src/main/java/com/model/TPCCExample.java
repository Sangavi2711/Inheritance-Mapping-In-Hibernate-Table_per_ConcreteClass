package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class TPCCExample {
 public static void main(String arg[]) {
	 Transaction tr= null;
	 try(Session ses=hibernateUtil.getSessionFactory().openSession()){
		 tr=ses.beginTransaction();
		 Employee2 e1= new Employee2("Sundar");
		 RegEmployee e2= new RegEmployee(80000f,800,"Surya");
		 Trainee e3 =new Trainee (30000,"24 month","Poorna Chandran");
		 ses.persist(e1);ses.persist(e2);ses.persist(e3);
		 tr.commit();
		 ses.close();
		 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
 }
}
