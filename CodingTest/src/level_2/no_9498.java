package level_2;

import java.util.Scanner;

public class no_9498 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int grade = scan.nextInt();
	if(grade>=90 && grade<=100) {
		System.out.println("A");
	}else if(grade>=80) {
		System.out.println("B");
	}else if(grade >= 70) {
		System.out.println("C");
	}else if(grade >= 60) {
		System.out.println("D");
	}else {
		System.out.println("F");
	}

}
}
