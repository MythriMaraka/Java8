package Pack2;

import javax.persistence.*;
//import org.hibernate.annotations.*;

@Entity
@Table(name = "oneadd")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	//private string Line,City,State,Country;
	private String Line, city, state, country;
	private int pincode;
	
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
