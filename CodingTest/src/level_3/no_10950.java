package level_3;

import java.util.Scanner;

public class no_10950 {
public static void main(String[] args) {
	//테스트 케이스
	Scanner scan = new Scanner(System.in);
	int testCase = scan.nextInt();
	
	//테스트케이스 수 만큼 입력값을 받아 연산결과 출력함.
	for(int i=0;i<testCase;i++) {
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+b);
	}
}
}
