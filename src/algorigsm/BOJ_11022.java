package algorigsm;

import java.util.Scanner;

public class BOJ_11022 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int x = 1;x<=t;x++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			
			System.out.println("Case #"+x+": "+a+" + "+b+" = "+c);
		}
		sc.close();
	}

}
