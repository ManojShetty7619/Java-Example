package com.java8featuresExample.streamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int emp_Id;
	String emp_Name;
	float salary;

	public Employee(int emp_Id, String emp_Name, float salary) {
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.salary = salary;

	}
}

public class StreamFilterExample {
	public static void main(String[] args) {
		List<Employee> empDetails = new ArrayList<Employee>();// create a list of employee
		empDetails.add(new Employee(101, "rahul", 15000f));
		empDetails.add(new Employee(102, "ramesh", 19000f));
		empDetails.add(new Employee(103, "naveen", 20000f));
		empDetails.add(new Employee(104, "deepak", 25000f));
		empDetails.add(new Employee(105, "adarsh", 128000f));
		empDetails.add(new Employee(106, "adithya", 14000f));
		empDetails.add(new Employee(107, "mani", 18000f));
		// without stream
//		List<Float> empSalaryList = new ArrayList<Float>();
//		List<String> empName = new ArrayList<String>();
//		List<Integer> empId = new ArrayList<Integer>();
//
//		
		// filter employee
//		for (Employee emp : empDetails) {
//			if (emp.salary < 20000) {
//				empSalaryList.add(emp.salary);// adding salary to salaryList
//				empName.add(emp.emp_Name);
//				empId.add(emp.emp_Id);
//			}
//		}
//		System.out.println("Employee name :" + empName + "\nEmployee id :" + empId + "\nnsalry:" + empSalaryList);// display
//																													// data

//		with Stream

//		List<Float> empSalaryList = empDetails.stream().//use stream
//				filter(p -> p.salary < 20000) // filter data
//				.map(p -> p.salary)// fetching salary
//				.collect(Collectors.toList());//collecting as list

		List<Float> empSalaryList = empDetails.stream().filter(p -> p.salary < 20000).map(p -> p.salary)
				.collect(Collectors.toList());

		System.out.println(empSalaryList);
		// use reduce() method to accumulate are combine sequence of input
//		float totalSalary = empDetails.stream()
//				.map(salary -> salary.salary)//fetching data
//				.reduce(0.0f,(sum, salary) -> sum + salary);// accumulate salary
		Float totalSalary = empDetails.stream().map(salary -> salary.salary).reduce(0.0f,
				(sum, salary) -> sum + salary);
		System.out.println("Total Salary :" + totalSalary);

		// with more precise code
//		float totalEmpSalary = empDetails.stream()
//				.map(empSalary -> empSalary.salary)//fetching data
//				.reduce(0.0f, Float::sum);//accumulating salary by referring method of Float class
		float totalEmpSalary = empDetails.stream().map(empSalary -> empSalary.salary).reduce(0.0f, Float::sum);
		System.out.println("Total Emp Salary :" + totalEmpSalary);
		
	}
}
