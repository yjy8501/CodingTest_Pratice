package algorigsm;

import java.util.Scanner;

public class BOJ_2577 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 150;
		int b = 266;
		int c = 427;
		int zero =0, one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
		
		int mul = a*b*c;
		
		String to = Integer.toString(mul);
		
		for(int i = 0;i<to.length();i++) {
			switch (to.charAt(i)) {
			case 0: zero += 1;
			case 1: one += 1;
			case 2: two +=1;
			case 3: three +=1;
			case 4: four +=1;
			case 5: five +=1;
			case 6: six +=1;
			case 7: seven +=1;
			case 8: eight +=1;
			case 9: nine +=1;
			default: break;
			}
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n",zero,one,two,three,four,five,six,seven,eight,nine);
	}

}
