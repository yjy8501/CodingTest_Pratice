package algorigsm;

import java.util.Scanner;
import java.util.StringTokenizer;

//next / nextLine 차이점 - next : 공백 발생 전까지만 값을 입력 받음 / nextLine : 공백 이후에도 값을 입력 받음
public class BOJ_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println(st.countTokens());

		sc.close();
	}

}
