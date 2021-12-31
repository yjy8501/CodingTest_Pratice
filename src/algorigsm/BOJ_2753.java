package algorigsm;

import java.util.Scanner;

public class BOJ_2753 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			if(year % 400 == 0) System.out.println(1);
			else if(year % 100 == 0) System.out.println(0);
			else System.out.println(1);
		}else System.out.println(0);
		sc.close();
	}

}
