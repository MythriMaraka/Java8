package Pack2;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

public class Hql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		   SessionFactory factory = meta.getSessionFactoryBuilder().build();
		   Session session = factory.openSession();
         Transaction t=session.beginTransaction();
         //List<Employee> emplist=session.createQuery("from Employee").list();
         CriteriaBuilder builder=session.getCriteriaBuilder();
         CriteriaQuery<Employee> criteria=builder.createQuery(Employee.class);
         Root<Employee> employeeRoot=criteria.from(Employee.class);
         criteria.where(builder.equal(employeeRoot.get("name"),"Sid"));
         List<Employee>emplist=session.createQuery(criteria).getResultList();
         
//         Criteria crt=session.createCriteria(Employee.class);
//         crt.add(Restrictions.eq("name", "Sid"));
//        // crt.add(Restrictions.allEq("Id",1));
//         crt.add(Restrictions.isEmpty("Id"));
//         List<Employee> emplist=crt.list();
         for(Employee employee:emplist)
         {
        	 System.out.println(employee.getName());
         }
         t.commit();
         session.close();
         factory.close();
	}

}
