package algorigsm;

import java.util.Scanner;

public class BOJ_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] list = new int[t];
		
		for(int i = 0;i<t;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[i] = a+b;
		}
		for(int i = 0;i<t;i++) {
			System.out.println(list[i]);
		}
		sc.close();
	}
}
