package com.yedam.generic;

import java.util.Arrays;

//<T>
//<?>, <? extends class>, <? super class>
//Person -> Worker
//		 -> Student -> HighStudent
//Course<T>
public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		// Course<Person>, Course<Worker>, Course<Student>, Course<HighStudent> 다 받을 수 있음.
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getstudents()));
		// [1,2,3] => [1,2,3]
	}
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getstudents()));
	}
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getstudents()));
	}
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인 과정", 5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고등학생"));

		Course<Worker> courseWorker = new Course<Worker>("직장인 과정", 5);
		courseWorker.add(new Worker("직장인"));

		Course<Student> courseStuent = new Course<Student>("학생 과정", 5);
		courseStuent.add(new Student("학생"));

		Course<HighStudent> coruseHigh = new Course<HighStudent>("고등학생 과정", 5);
		coruseHigh.add(new HighStudent("고등학생"));
		
		//course<?>
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStuent);
		registerCourse(coruseHigh);
		
		//Course<? extends class>
		registerStudent(courseStuent);
		registerStudent(coruseHigh);
		
		//Course<? super class>
		registerWorker(coursePerson);
		registerWorker(courseWorker);
	}

}
