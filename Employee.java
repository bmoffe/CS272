

import java.util.Arrays;

public class Employee {
	
	private String name;
	private int age;
	private int employeeNum;
	private String state;
	private int zip;
	private static int [] advisors;
	
	public static void main(String[] args) {
		//e1
		Employee e1 = new Employee();
			e1.setName("Test case");
			e1.setAge(45);
			e1.setEmployeeNum(1234);
			e1.setState("NM");
			e1.setZip(88002);
			e1.setAdvisors(new int [] {2,4,1});
			System.out.println(e1.toString());
		//e2
		Employee e2 = new Employee();
			e2.setName("e2");
			e2.setAge(44);
			e2.setEmployeeNum(5525);
			e2.setState("NY");
			e2.setZip(12574);
			e2.setAdvisors(new int [] {2,5,3});
			System.out.println(e2.toString());
		//Test case
		Employee employee = new Employee();
			employee.setName("Corina Vasquez");
			employee.setAge(45);
			employee.setEmployeeNum(100);
			employee.setState("TX");
			employee.setZip(79902);
			employee.setAdvisors(new int [] {1,2,1});
			System.out.println(employee.toString());
	}

	//no argument constructor
	public Employee() {
		super();
		this.name = null;
		this.age = 0;
		this.employeeNum = 0;
		this.state = null;
		this.zip = 0;
		this.advisors = null;
	}

	//copy constructor
	public Employee (Object obj) {
		if (obj == null) {
			return;
		}
		if (obj instanceof Employee) {
			Employee e = (Employee) obj;
			name = e.name;
			age = e.age;
			employeeNum = e.employeeNum;
			state = e.state;
			zip = e.zip;
			advisors = e.advisors;
		}
	}
    
	//getters and setters for instance variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public static int [] getAllAdvisors(Employee e1, Employee e2) {
		return advisors;
	}

	public void setAdvisors(int[] advisors) {
		this.advisors = advisors;
	}

	public String toString() {
		return "Employee name: " + name + ", age: " + age + ", employeeNum: " + employeeNum + ", state: " + state
				+ ", zip: " + zip + ", advisors: " + Arrays.toString(advisors) + "";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeNum != other.employeeNum)
			return false;
		return true;
	}
	
}
