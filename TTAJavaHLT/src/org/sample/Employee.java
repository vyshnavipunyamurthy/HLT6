package org.sample;

public class Employee {
	int eid;
	String ename;
	double salary;
	String email;
	String department;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("Krithik");
		e1.setSalary(1100000);
		e1.setEmail("K@gmail.com");
		e1.setDepartment("R&D");
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getSalary());
		System.out.println(e1.getEmail());
		System.out.println(e1.getDepartment());
		System.out.println("====================");
		System.out.println("Employee ID:"+e1.getEid());
		System.out.println("Employee Name:"+e1.getEname());
		System.out.println("Employee Salary:"+e1.getSalary());
		System.out.println("Employee Email:"+e1.getEmail());
		System.out.println("Employee Department:"+e1.getDepartment());
		
		
	}

}
