package algorigsm;

import java.util.Scanner;
//팩토리얼의 0개수 구하기
public class BOJ_1676{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		while(n >=5) {
			cnt += n/5;
			n /=5;
		}
		
		System.out.println(cnt);
		sc.close();
	}

}
