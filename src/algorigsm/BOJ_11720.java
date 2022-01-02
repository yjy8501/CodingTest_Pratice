package algorigsm;

import java.util.Scanner;

public class BOJ_11720 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		int sum = 0;
		sc.close();
		
		for(int i = 0;i<n;i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
