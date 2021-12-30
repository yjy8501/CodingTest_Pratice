package algorigsm;

import java.util.Scanner;

public class BOJ_1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
        	sc.close();
        }
	}
}
