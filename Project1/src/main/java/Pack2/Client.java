package Pack2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.sql.*;

public class Client {

	public static void main(String[] args) 
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
        Transaction t=session.beginTransaction();
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setEmpId(5);
        e1.setName("Mythri");
        e1.setSalary(10000);
        e2.setEmpId(6);
        e2.setName("Ashok");
        e2.setSalary(20000);
        
        Address a1=new Address();
        Address a2=new Address();
        a1.setLine("Medical");
        a1.setCity("Hyderabad");
        a1.setState("Telangana");
        a1.setCountry("India");
        a1.setPincode(507111);
        a2.setLine("Ashokn");
        a2.setCity("Hyderabad");
        a2.setState("AP");
        a2.setCountry("India");
        a2.setPincode(507101);
       
        e1.setAddress(a1);
        e2.setAddress(a2);
        session.save(e1);
        session.save(e2);
        session.save(a1);
        session.save(a2);
        t.commit();
        session.close();
        factory.close();
//        
        
        

	}

}
