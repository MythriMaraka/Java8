package Pack2;

	import javax.persistence.*;
	//import javax.annotation.Generated;
	import java.util.*;

	@Entity
	@Table(name="crud1")
	public class Employeehiber 
	{
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int Id;
		private String name;
		private int empId;
		private int salary;
		//private Address address;
	
		public int getId() {
			return Id;
		}
	
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}

	
}
