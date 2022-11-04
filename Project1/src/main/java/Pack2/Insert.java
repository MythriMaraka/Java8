package Pack2;

		import org.hibernate.Session;
		import org.hibernate.SessionFactory;
		import org.hibernate.Transaction;
		import org.hibernate.boot.Metadata;
		import org.hibernate.boot.MetadataSources;
		import org.hibernate.boot.registry.StandardServiceRegistry;
		import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
		import java.sql.*;
		public class Insert {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
				   SessionFactory factory = meta.getSessionFactoryBuilder().build();
				   Session session = factory.openSession();
		           Transaction t=session.beginTransaction();
				 //  Employee emp=session.get(Employee.class,1);
		           Employee emp=new Employee();
				   emp.setId(3);
				   emp.setName("Sid");
				   emp.setEmpId(103);
				   emp.setSalary(30000);
				   //System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getSalary());
				   session.saveOrUpdate(emp);
//				   emp.setId(1);
//		           emp.setEmpId(104);
//		           emp.setName("Mythri");
//		           emp.setSalary(100000);
//		           System.out.print(emp.getEmpId()+" "+emp.getName()+" "+emp.getSalary()+" ");
		           //session.saveOrUpdate(emp);
				   //Employee e =99 new Employee();
//				   Employee emp1=session.get(Employee.class,1);
//				   emp1.setId(4);
//				   emp1.setName("sid");
//				   emp1.setEmpId(104);
//				   emp1.setSalary(10000);
//				   session.saveOrUpdate(emp1);
//				   System.out.print(emp.getEmpId()+" "+emp.getName()+" "+emp.getSalary()+" ");
//		           
//				   
				   }
			 
//			private static void select(String string) {
//				// TODO Auto-generated method stub
//				}
//				
			   //Transaction t=session.beginTransaction();
			



	}


