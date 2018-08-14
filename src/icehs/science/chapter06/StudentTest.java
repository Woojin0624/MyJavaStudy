package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student hong = new Student();
		hong.name = "ȫ�浿";
		hong.id = "S001";
		hong.korean = 94;
		hong.english = 80;
		hong.math = 84;
		
		hong.printStudentInfo();
		
		hong.changeId("S002");
		
		System.out.println();
		hong.printStudentInfo();

	}

}
