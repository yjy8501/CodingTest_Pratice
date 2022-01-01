package algorigsm;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_10818 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//己傍茄 规过
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]+" "+a[n-1]);
		
		//角菩茄 规过
//		int n = sc.nextInt();
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		int a[] = new int[n];
//		
//		for(int i = 0;i<n;i++) {
//			a[i] = sc.nextInt();
//			if(min >= a[i]) {
//				min = a[i];
//			}else if(max <= a[i]) {
//				max = a[i];
//			}
//		}
//		System.out.println(min+" "+max);
		sc.close();
	}

}
