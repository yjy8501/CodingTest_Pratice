package algorigsm;

import java.util.Scanner;

public class BOJ_2475 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[5];
		int sum = 0;
		
		for(int i = 0;i<5;i++) {
			n[i] = sc.nextInt();
			sum += n[i]*n[i];
		}
		System.out.println(sum%10);
		sc.close();
	}

}
