package com.java8featuresExample.streamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.collections.Set;

class Company {
	int emp_Id;
	String emp_Name;
	float emp_Salary;

	public Company(int emp_Id, String emp_Name, float emp_Salary) {
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Salary = emp_Salary;

	}
}

public class StreamCollectorsExample {
	public static void main(String[] args) {
		List<Company> employeeDetails = new ArrayList<>();
		employeeDetails.add(new Company(101, "rahul", 15000f));
		employeeDetails.add(new Company(102, "ramesh", 19000f));
		employeeDetails.add(new Company(103, "naveen", 20000f));
		employeeDetails.add(new Company(104, "deepak", 25000f));
		employeeDetails.add(new Company(105, "adarsh", 128000f));
		employeeDetails.add(new Company(106, "adithya", 14000f));
		employeeDetails.add(new Company(107, "mani", 18000f));
		// sum by using Collectors method
		double totalSalary = employeeDetails.stream().collect(Collectors.summingDouble(salary -> salary.emp_Salary));// using
		// Collectors// method to sum the prices

		System.out.println("Total Emp Salary :" + totalSalary);

		// Find Maximum and Minimum Employee Salary
		// max() method to get max Employee salary
		Company employeeA = employeeDetails.stream()
				.max((employee1, employee2) -> employee1.emp_Salary > employee2.emp_Salary ? 1 : -1).get();
		System.out.println("Max Salary :" + employeeA.emp_Salary);
		// min() method to get min Product price
		Company employeeB = employeeDetails.stream()
				.min((employee1, employee2) -> employee1.emp_Salary > employee2.emp_Salary ? 1 : -1).get();
		System.out.println("Max Salary :" + employeeB.emp_Salary);

		// Count () method in Collection

		long count = employeeDetails.stream().filter(salary -> salary.emp_Salary < 20000).count();
		System.out.println("Count no of employees :" + count);

		// Convert List to Set
		// Converting Employee list into set
		java.util.Set<Float> employeeSalaryList = employeeDetails.stream()
				.filter(employee -> employee.emp_Salary < 20000)// filter employee basis of salary
				.map(employee -> employee.emp_Salary)// fetch data
				.collect(Collectors.toSet());// collect it as Set(remove duplicate elements)
		System.out.println("List to Set :" + employeeSalaryList);

		// Converting Employee list to Map
		Map<Integer, String> employeeSalaryMap = employeeDetails.stream()
				.collect(Collectors.toMap(s -> s.emp_Id, s -> s.emp_Name));
		System.out.println("list to Map :" + employeeSalaryMap);

	}

}
