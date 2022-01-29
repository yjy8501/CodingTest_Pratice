package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위가 높은 숫자순으로 우선순위큐 초기화
		
		for(int i = 0;i<n;i++) {
			int x = Integer.parseInt(br.readLine()); //큐의 넣을 값을 입력
			if(x != 0) { // 넣는 값이 0이 아니면 우선순위큐에 추가
				pq.offer(x);
			}
			if(x == 0) { // 넣는 값이 0이면 우선순위큐에 추가하고 우선순위가 높은 값을 sb에 넣고 삭제
				pq.offer(x);
				sb.append(pq.poll()).append("\n");
			}
		}
		System.out.println(sb);
	}

}
