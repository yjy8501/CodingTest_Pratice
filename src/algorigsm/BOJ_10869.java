package algorigsm;

import java.util.Scanner;

public class BOJ_10869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
			
//BOJ_1100문제
    char[][] chessBoard = new char[8][8];

    int num = 0;
	String str = "";
    for (int i = 0; i < 8; i++) {
      str = sc.nextLine();
      for (int j = 0; j < 8; j++) {
        chessBoard[i][j] = str.charAt(j);

        if ((i + j) % 2 == 0 && chessBoard[i][j] == 'F') {
            num++;
        }
      }
    }

//BOJ_1075문제
	System.out.println(num);
	
	
	int N = sc.nextInt();
	int F = sc.nextInt();
	int temp = (N/100)*100;
	
	while(true) {
		if(temp%F==0) {
			int result = temp%100;
			if(result < 10) System.out.println("0"+result);
			else System.out.println(result);
			return;
		}
	temp++;
	        }
		}
	
}


