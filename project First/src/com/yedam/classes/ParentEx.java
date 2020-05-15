package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class ParentEx {
	public static void main(String[] args) {
		Parent parent = new Parent("", "",  "");
		parent.getLastName(); //degault
		parent.getFirstName(); //protected
		parent.getTelNumber(); //public
	}
}
