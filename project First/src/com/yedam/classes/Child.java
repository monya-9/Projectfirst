package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent {
	Child() {
		super();
		
	}
	
	Child(String lastName, String firstName, String telNumber){
	super(lastName, firstName, telNumber);
	}
	
	void showInfo() {
		Child child = new Child();
		child.getLastName();
		child.getFirstName();
		child.getTelNumber();
	}
}
