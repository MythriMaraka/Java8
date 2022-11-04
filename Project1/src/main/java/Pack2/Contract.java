package Pack2;
import javax.persistence.*;
@Entity
@Table(name="Contract")
//@DiscriminatorValue("contract")

public class Contract extends Employe
{
float pay;
String time;
public float getPay() {
	return pay;
}
public void setPay(float pay) {
	this.pay = pay;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
}
