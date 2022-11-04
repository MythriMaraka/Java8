package Pack2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@NamedQueries(
	{
		@NamedQuery
		(
			name="findEmployeeByName",
		 query="from Employe e where e.name = :name"
        )
	}
)
@Entity
@Table(name="Employ11")
@Inheritance(strategy= InheritanceType.JOINED)
//@DiscriminatorColumn(name="discriminator")
public class Employe 
{
        @Id
		@GeneratedValue(strategy=GenerationType.AUTO)
        
		private int Id;
        @Column(name="name")
		private String name;
        @Column(name="Address")
		private String Address;
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
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		
}


