package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MiddleNumber {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> minq = new PriorityQueue<Integer>(); // 우선순위가 낮은 순
		PriorityQueue<Integer> maxq = new PriorityQueue<Integer>(Collections.reverseOrder()); // 우선순위가 높은 순
		
		for(int i = 0;i<n;i++) {
			int num = Integer.parseInt(br.readLine()); // 정수 입력
			if(minq.size()==maxq.size()) { // 최대힙과 최소힙의 크기가 같으면 최대힙에 저장
				maxq.offer(num);
			}else { // 그렇지 않으면 최소힙에 저장
				minq.offer(num);
			}
			if(!minq.isEmpty() && !maxq.isEmpty()) { // 두 우선순위큐가 비어있지 않다면
				if(minq.peek() < maxq.peek()) { // 최대값이 최소값보다 크다면
					int temp = minq.poll(); // 서로의 값을 교환해준다.
					minq.offer(maxq.poll());
					maxq.offer(temp);
				}
			}
			sb.append(maxq.peek()).append("\n"); // 출력문에 최대힙의 peek부분을 추가
		}
		System.out.println(sb);

	}

}
