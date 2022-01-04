package algorigsm;

import java.util.Scanner;

public class BOJ_2581 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum=0;
		int min = 0;
		
		for(int i = m;i<=n;i++) {
				int j = 2;
				for(;j<n;j++) { // 소수가 아니라면
					if(i%j==0)
						break;
				}
				if(j==i) { // 소수이면
					sum += j;
					if(min != 0) { // 소수 중 최소값이 0이 아니면
						continue;
					}else min = j; // 소수이면 j 대입
				}
			}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		sc.close();
		}
}


