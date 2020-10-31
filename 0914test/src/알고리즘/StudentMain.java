package 알고리즘;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student("손오공","1682");

		Student st2 = new Student("삼장법사","1992");
		 
		Student st3 = new Student("사오정","1523");

     ArrayList <Student> list = new  ArrayList <Student>();
     System.out.println(list.size());
  
	
     list.add(st1);
     System.out.println(st1);
	list.add(st2);
	System.out.println(st2);
	list.add(st3);
	System.out.println(st3);
	 
	for(Student stu : list) {
		System.out.println(stu.getName());
		System.out.println(stu.getNo());
	}

	Scanner scan = new Scanner(System.in);
	
	
	
	
	while(true) {
		System.out.println("계속 검색을 하고싶으면 y,종료하고싶으면 n");
		String input = scan.next();
		
		if(input.equals("y")) {
		System.out.println("검색을 시작합니다.");
		String name = scan.next();
		boolean flag = false;
		for(Student stu : list) {
			if(stu.getName().equals(name)) {
				System.out.println("해당하는 학생의 학번은 :"+stu.getNo());
			flag = true;
			}
		}
		if(!flag) {
			System.out.print("해당하는 학생이름이 없습니다.");
		}
		}else if(input.equals("n")) {
			break;
		}
	}
System.out.println("프로그램이 종료되었습니다.");
	}

}
