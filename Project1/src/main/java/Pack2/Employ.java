package Pack2;
import javax.persistence.*;
@NamedQueries(
	{
		@NamedQuery(
			name="findEmployByName",
					query="from Employ e where e.name = :name"
		         )
	}
)
@Entity
@Table(name="Employ1")
@Inheritance(strategy= InheritanceType.JOINED)
//@DiscriminatorColumn(name="discriminator")
public class Employ
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


