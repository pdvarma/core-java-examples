package com.apex.assignments;

public class Employee {
	private int empNo;
	private String empName;
	String address;
	String State;
	int zipCode;
	int phone;
	String designation;
	int experienceinYears;
	String email;
	int basic;
	int hra;
	double bonus;
	double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empNo, String empName, String address, String state, int zipCode, int phone, String designation,
			int experienceinYears, String email, int basic, int hra, double bonus, double salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
		this.State = state;
		this.zipCode = zipCode;
		this.phone = phone;
		this.designation = designation;
		this.experienceinYears = experienceinYears;
		this.email = email;
		this.basic = basic;
		this.hra = hra;
		this.bonus = bonus;
		this.salary = salary;
	}
	
	public double calcuateSalary() {
		salary = (basic + hra + (bonus / 100) * basic);
		return salary;
	}
	public int getEmpNo() {
		
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getExperienceinYears() {
		return experienceinYears;
	}

	public void setExperienceinYears(int experienceinYears) {
		this.experienceinYears = experienceinYears;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		String employee = "";
		employee += "\nEmployee Number: " + getEmpNo();
		employee += "\nEmployee Name: " + getEmpName();
		employee += "\nAddress: " + getAddress();
		employee += "\nState: " + getState();
		employee += "\nZip Code: " + getZipCode();
		employee += "\nPhone: " + getPhone();
		employee += "\nDesignation: " + getDesignation();
		employee += "\nExperience: " + getExperienceinYears();
		employee += "\nEmail: " + getEmail();
		employee += "\nBasic: " + getBasic();
		employee += "\nHra: " + getHra();
		employee += "\nBonus: " + getBonus();
		employee += "\nSalary: " + calcuateSalary();

		return employee;
	}


	public static void main(String[] args) {
		Employee employee1 = new Employee(1,"Jil","211 Moorpark", "CA", 95035, 408666099, "Lead", 3, "jil.thomas@yahoo.com", 5000, 30, 5, 8);
		Employee employee2 = new Employee(2,"Cristy","998 Arbor Way", "Newark", 92135, 5102123, "Analyst", 2, "cristy@gmail.com", 3000, 35, 10, 8);
		Employee employee3 = new Employee(3,"Vikram","21 ", "CA", 45035, 408666602, "Manager", 13, "vikram23@yahoo.com", 9000, 45, 5, 8);
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}

}
