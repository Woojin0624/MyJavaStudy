package icehs.science.chapter06;

public class Student {
	String name;
	String id;
	int korean;
	int english;
	int math;
	
	int calculateAverage() {
		int average = (korean + english + math)/3;
		return average;
	}
	void printStudentInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(korean);
		System.out.println(english);
		System.out.println(math);
		
	}
	void changeId(String newId) {
		id = newId;
	}
}
