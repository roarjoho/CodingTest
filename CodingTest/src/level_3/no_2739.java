package level_3;

import java.util.Scanner;

public class no_2739 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	for(int i=1; i<10;i++) {
		System.out.println(n + " * "+i+" = "+ (n*i));
	}
}
}
