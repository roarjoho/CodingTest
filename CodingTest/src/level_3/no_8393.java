package level_3;

import java.util.Scanner;

public class no_8393 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int result = 0;
	
	for(int i=1; i<=n; i++) {
		result += i;
	}
	System.out.println(result);

	
}
}
