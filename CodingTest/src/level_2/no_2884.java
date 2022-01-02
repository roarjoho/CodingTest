package level_2;

import java.util.Scanner;

public class no_2884 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int h = scan.nextInt();
	int m = scan.nextInt();
	
	if(h==0) {
		if(m < 45) {
			h = 23;
			m = 15+m;
		}else {
			m = m-45;
		}
	}else {
		 if(m < 45) {
			h = h-1;
			m = 15+m;
		}else {
			m = m-45;
		}
	}
	System.out.println(h+" "+m);
}
}
