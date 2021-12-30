//틀린 답안
package algorigsm;

import java.util.Scanner;

public class BOJ_1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //확인할 문자열 총 개수 
		
		int i = 0;
		String[] result = new String[n];
		
		for(i = 0;i<n;i++) {
			result[i] = sc.next();
		}
		boolean a = true;
		for(i =0; i<n;i++) {
			for(int j = 0;j<result[0].length();j++) {
				if(result[i].charAt(j) != result[i+1].charAt(j)) {
					System.out.print("?");
				}else {
					System.out.print(result[i].charAt(j));
				}
			}
		}
		sc.close();
	}
}
	


