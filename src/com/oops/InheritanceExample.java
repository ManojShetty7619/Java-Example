package com.oops;

public class InheritanceExample {
	// inherit parent class property in to child class
	void showA() {
		System.out.println("class1 method ");
	}

}

class ChildClassB extends InheritanceExample {// inherit using extends key word and is a single inheritance
	void showB() {
		System.out.println("class2 method");
	}
}



class ChildClassC extends ChildClassB { // multilevel inheritance
	void showC() {
		System.out.println("class3 method");

	}

	public static void main(String[] args) {
		InheritanceExample classA = new InheritanceExample();// create object of parent class
		classA.showA();
		// classA.showB(); //we can't call child class method through parent class
		// object
		System.out.println("-------------------");
		ChildClassB classB = new ChildClassB();//IS-A relationship
		classB.showA();
		classB.showB();// we can call parent class method through child class object
		System.out.println("-------------------");
		ChildClassC classC = new ChildClassC();
		classC.showA();
		classC.showB();
		classC.showC();
		System.out.println("-----------------");
		ChildClassD classD = new ChildClassD();// creating HAS-A relationship
		classD.showD();
		System.out.println("----------------");
		ChildClassE classE = new ChildClassE();//HAS-A relationship
		classE.showE();

	}
}
class ChildClassD extends InheritanceExample {// Hierarchical inheritance: both class extends single class property
void showD() {
	System.out.println("cladd4 method");
}
}
class ChildClassE {
	void showE() {
		System.out.println("class5 method");
	}
}
