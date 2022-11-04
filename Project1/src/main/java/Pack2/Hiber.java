package Pack2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.sql.*;
public class Hiber {
//only employee class
	public static void main(String[] args) {
		   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		   SessionFactory factory = meta.getSessionFactoryBuilder().build();
		   Session session = factory.openSession();
           Transaction t=session.beginTransaction();
           Employeehiber emp=new Employeehiber();
           emp.setId(101);
           emp.setEmpId(1001);
           emp.setName("Mythri");
           emp.setSalary(100000);
           session.save(emp);
           t.commit();
           session.close();
           
	}
}

