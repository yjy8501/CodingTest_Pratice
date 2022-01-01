package algorigsm;

import java.util.Scanner;

public class BOJ_11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int x = 1;x<=t;x++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #"+x+": "+(a+b));
		}
		sc.close();
	}

}
