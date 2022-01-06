package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BigNumber_Buffer {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken()); // n 토큰 생성(배열 크기)
			int m = Integer.parseInt(st.nextToken()); // m 토큰 생성(횟수)
			int k = Integer.parseInt(st.nextToken()); // k 토큰 생성(규칙)
			int[] array = new int[n]; // n크기의 배열 생성
			int sum = 0; // 합계
			int index = 0; // array배열 인덱스 번호
			
			StringTokenizer str = new StringTokenizer(br.readLine()); 
			 
			while (str.hasMoreTokens()) { // 토큰이 없을 때까지
				array[index++] = Integer.parseInt(str.nextToken());//인덱스 1씩 증가하면서 정수 입력
			}
			Arrays.sort(array);//배열 오름차순 정렬
			int back = array[n-1];// 가장 큰 수
			int back2 = array[n-2];// 두번째로 큰 수
			
			while(true) { // 무한 반복
				if(m == 0) break; // 횟수가 0이면 while문 탈출
				for(int i = 0;i<k;i++) { //가장 큰 수를 k만큼 sum에 증가
					sum += back;
					m-=1; // 횟수 감소
					if(m==0) break; // 횟수가 0이면 while문 탈출
				}
				sum+=back2; // 두번째로 큰 수 sum에 증가
				m-=1; // 횟수 감소
			}
			System.out.println(sum); // 횟수 출력
	}

}
