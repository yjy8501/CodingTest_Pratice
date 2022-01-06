package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumberRule {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		//n = 배열크기 / m  = 더할 횟수 / k = k까지만 반복하게 하는 법칙
		int sum = 0;//합계
		int[] a = new int[n]; //n크기의 배열 생성
		

		for(int i = 0;i<n;i++) { // 배열 안의 정수 입력
			a[i] = sc.nextInt();
		}
		sc.close(); // scanner close
		Arrays.sort(a);//배열 a를 오름차순으로 정렬
		int back = a[n-1]; // 가장 큰 수
		int back2 = a[n-2]; // 두번째로 큰 수 
			
			while(true) { // 계속 반복
				for(int i = 0;i<k;i++) { // sum에 k만큼 가장 큰 수를 더하는 for문
					if(m==0) break;// while문 탈출
					sum+=back;//sum에 가장 큰 수 더함
					m -=1; // m(횟수) 1씩 감소
				}
				if(m==0) break; // while문 탈출
				sum+=back2; //sum에 두번째로 큰 수 더함
				m-=1;//m(횟수) 1씩 감소
			}
			System.out.println(sum); // sum 출력
		
		//그리디 답안
		int count = (int)(m/(k+1))*k; // 6
		count+=m%(k+1); // 6+0 = 6
		System.out.println(count); // 6
		
		sum +=(count)*back; //36
		sum += (m-count)*back2; // 2*5 = 10
			
		System.out.println(sum);
		
		
	}

}
