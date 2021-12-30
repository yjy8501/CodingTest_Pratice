package algorigsm;

import java.util.Scanner;

public class BOJ_1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
	    sc.close();
	}

}
