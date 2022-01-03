package algorigsm;

import java.util.Scanner;

public class BOJ_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<n;i++) {
			int j = 2;
			for(; j<a[i];j++) {
				if(a[i]%j==0) break;
			}
			if(j == a[i]) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
