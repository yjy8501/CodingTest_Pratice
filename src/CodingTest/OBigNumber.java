package CodingTest;

import java.util.Scanner;
import java.util.Stack;

public class OBigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		int[] list = new int[n];
		for(int i = 0;i<n;i++) {
			int num = sc.nextInt();
			stack.push(num);
		}
		sc.close();
		if(n==1) {
			list[n-1] = -1;
		}
		for(int i = 0;i<n-1;i++) {
			list[n-1] = -1;
			for(int j = i+1;j<n;j++) {
				if(stack.get(i)<stack.get(j)) {
					list[i] = stack.get(j);
					break;
				}else if(stack.get(i)>stack.get(j)) {
					list[i] = -1;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<list.length;i++) {
			sb.append(list[i]+" ");
		}
		System.out.println(sb);
	}


}
