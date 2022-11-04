package Pack2;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Regular")
//@DiscriminatorValue("regular")

public class Regular extends Employe
{
float salary;
float bonus;
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public float getBonus() {
	return bonus;
}
public void setBonus(float bonus) {
	this.bonus = bonus;
}

}
