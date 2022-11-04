package Pack2;

import javax.persistence.*;
//import javax.annotation.Generated;
import java.util.*;

@Entity
@Table(name="manytomanyemp")
public class Employee3
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
private List<Address3> address=new ArrayList<Address3>();
	public int getId() {
		return Id;
	}
	public List<Address3> getAddress() {
		return address;
	}
	public void setAddress(List<Address3> address) {
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
