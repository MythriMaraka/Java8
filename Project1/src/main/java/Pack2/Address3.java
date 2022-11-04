package Pack2;

import java.util.*;

import javax.persistence.*;
//import org.hibernate.annotations.*;

//import antlr.collections.List;

@Entity
@Table(name = "manytomanyadd")
public class Address3 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	//private string Line,City,State,Country;
	private String Line, city, state, country;
	private int pincode;
	@ManyToMany
	private List<Employee3> employee =new ArrayList<Employee3>();
	//private List<Address3> address=new ArrayList<Address3>();
	
	public List<Employee3> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee3> employee) {
		this.employee = employee;
	}
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getLine() {
		return Line;
	}
	public void setLine(String line) {
		Line = line;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}

