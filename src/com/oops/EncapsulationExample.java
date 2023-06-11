package com.oops;

import com.collections.IteratorExample;

//wrapping data and code acting on data in a single unit
//All variables are private

public class EncapsulationExample {
	private int emp_Id; // data

	public void setEmpId(int emp_Id1) { // create public method for setter and getter
		emp_Id = emp_Id1;
	}

	public int getEmpId() {// create getter method
		return emp_Id;
	}

}

class Company {
	public static void main(String[] args) {
		EncapsulationExample e = new EncapsulationExample();
		e.setEmpId(111);
		System.out.println("employee Id :" + e.getEmpId());
	}

}
