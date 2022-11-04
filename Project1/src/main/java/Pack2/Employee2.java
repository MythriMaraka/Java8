package Pack2;

import javax.persistence.*;
//import javax.annotation.Generated;
import java.util.*;

@Entity
@Table(name="manytooneemp")
public class Employee2
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String name;
	private int empId;
	private int salary;
	//private Address address;
@OneToMany
//(targetEntity = Address2.class,cascade=CascadeType.ALL)
private List<Address2> address=new ArrayList<Address2>();
	public int getId() {
		return Id;
	}
	public List<Address2> getAddress() {
		return address;
	}
	public void setAddress(List<Address2> address) {
		this.address = address;
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
