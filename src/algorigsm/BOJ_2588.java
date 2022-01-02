package algorigsm;

import java.util.Scanner;

public class BOJ_2588 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		sc.close();
		//-'0'을 쓰는 이유 : 현재 String의 385 값은 아스키코드로 저장되어있기 때문에 int형인 것을 알려주기 위함
		System.out.println(a*(b.charAt(2)-'0'));
		System.out.println(a*(b.charAt(1)-'0'));
		System.out.println(a*(b.charAt(0)-'0'));
		System.out.println(a*Integer.parseInt(b));
	}

}
