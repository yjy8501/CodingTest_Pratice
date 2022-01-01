package algorigsm;

import java.util.Scanner;

public class BOJ_2884 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int a = 0;
		m = m -45;
		if(m <= 60) {
			a = 60+m;
			m = a;
			h = h -1;
		}
		if(h <= 0) {
			h = 23;
		}
		System.out.printf("%d %d",h,m);
		sc.close();
	}

}
