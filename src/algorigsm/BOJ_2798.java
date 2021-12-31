package algorigsm;

import java.util.Scanner;

public class BOJ_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 10;
		int M = 500;
		int min = Integer.MAX_VALUE;
		
		int sum = 0;
		int[] score = {93,181,245,241,315,36,185,138,216,295};
		for(int i = 0;i<N;i++) {
			if(M < sum) {
				sum = 0;
				i = 0;
				continue;
			}else if(M >= sum) {
				sum += score[i];
			}
		}
		System.out.println(sum);
	}

}
