package algorigsm;

import java.util.Scanner;
//최소공배수 구하기

public class BOJ_1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i = 0;i<t;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(max(a,b));
		}
		sc.close();
	}
	public static int min(int a, int b) {
		while(true) {
			int r = a%b;
			a = b;
			b = r;
			if(b == 0) {
				break;
			}
		}
		return a;
	}
	public static int max(int a, int b) {
		return a*b/min(a,b);
	}

}
