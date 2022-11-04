
package Pack2;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.*;

public class Inherit {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t=session.beginTransaction();
		Employe e1=new Employe();
		TypedQuery query=session.getNamedQuery("findEmployeeByName");
		//TypedQuery<Employe> query=session.getNamedQuery("findEmployByName");
		query.setParameter("name", "Mythri");
		List<Employe> emp=query.getResultList();
		Iterator<Employe> itr=emp.iterator();
		while(itr.hasNext())
		{
		Employe e=itr.next();
		System.out.print(e);
		}
        //Transaction t=session.beginTransaction();
//        
//        Employ e=new Employ();
//        e.setId(1);
//        e.setName("Mythri");
//        e.setAddress("Hyd");
//        
//        Regular r=new Regular();
//        r.setName("Ashok");
//        r.setSalary(100f);
//        r.setAddress("Bglr");
//        r.setBonus(10f);
//        
//        Contract c=new Contract();
//        c.setPay(1000f);
//        c.setName("Sid");
//        c.setAddress("Kerala");
//        c.setTime("10");
////        
//        session.save(e);
//        session.save(r);
//        session.save(c);
    t.commit();
        session.close();
        

	}

}
