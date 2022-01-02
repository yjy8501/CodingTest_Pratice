package algorigsm;

import java.util.Scanner;

public class BOJ_10872 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(fact(n));
		
		sc.close();
	}
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}else if(n <= 1) {
			return n;
		}else {
			return fact(n-1)*n;
		}
	}
}
