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

public class Client2 {

	public static void main(String[] args) 
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
        Transaction t=session.beginTransaction();
        Employee2 employee=new Employee2();
       // Employee2 e2=new Employee2();
        employee.setEmpId(5);
        employee.setName("Mythri");
        employee.setSalary(10000);
//        e2.setEmpId(6);
//        e2.setName("Ashok");
//        e2.setSalary(20000);
        
        Address2 address=new Address2();
       
        address.setLine("Medical");
        address.setCity("Hyderabad");
        address.setState("Telangana");
        address.setCountry("India");
        address.setPincode(507111);
        //address.setEmployee(employee);
       
       
         employee.getAddress().add(address);
       // e2.setAddress(a2);
        session.save(employee);
     //   session.save(e2);
        session.save(address);
        //session.save(a2);
        t.commit();
        session.close();
        factory.close();
//        
        
        

	}

}
