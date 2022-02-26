package student_project;

public class Student_info {
	private int id;
	private String name;
	private String department;
	private int age;
	private String address;
	private String phone_number;

	Student_info(int id,String name,String department,int age,String address,String phone_number){
		this.id=id;
		this.name=name;
		this.department=department;
		this.age=age;
		this.address=address;
		this.phone_number=phone_number;	
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


}
