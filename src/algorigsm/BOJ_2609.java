package algorigsm;

import java.util.Scanner;

public class BOJ_2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(min(a,b));
		System.out.println(max(a,b));
		sc.close();
		
	}
	public static int min(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}
	public static int max(int a, int b) {
		return a*b/min(a,b);
	}

}
