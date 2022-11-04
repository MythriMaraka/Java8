package Pack2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.sql.*;
import java.util.*;

public class Client1 {

	public static void main(String[] args) 
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
        Transaction t=session.beginTransaction();
        Employee1 e1=new Employee1();
       // Employee2 e2=new Employee2();
        e1.setEmpId(5);
        e1.setName("Mythri");
        e1.setSalary(10000);
//        e2.setEmpId(6);
//        e2.setName("Ashok");
//        e2.setSalary(20000);
        
        Address1 address=new Address1();
       
        address.setLine("Medical");
        address.setCity("Hyderabad");
        address.setState("Telangana");
        address.setCountry("India");
        address.setPincode(507111);
       
       
         e1.getAddress().add(address);
       // e2.setAddress(a2);
        session.save(e1);
     //   session.save(e2);
        session.save(address);
        //session.save(a2);
        t.commit();
        session.close();
        factory.close();
//        
        
        

	}

}
