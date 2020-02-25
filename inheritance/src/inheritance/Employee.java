package inheritance;
import java.util.Comparator;
public class Employee implements Comparator<Employee>{
	int id;
	String name;
	String address;
	String designation;
	int age;
	double salary;
	long phone;
	
	
	public Employee(int id, String name, String address, String designation, int age, double salary, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
	}


	
	public int getId() {
		 return id;
		}

	public void setId(int id) {
		 this.id = id;
		}
	
	public String getName() {
		 return name;
		}

	public void setName(String name) {
		 this.name = name;
		}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", address=" + address + ", designation=" + designation
		+ ", age=" + age + ", salary=" + salary + ", phone=" + phone + "]"; //to display the values of objects
	
	
	}
	
	
	@Override
	public int compare(Employee emp1,Employee emp2)
	{
		if(emp1.getId()>emp2.getId())
		{
			return 1;
		}else if(emp1.getId()==emp2.getId()) {
			return 0;
		}else {
			return -1;
		}
	}
}
	



	
	

	
	
