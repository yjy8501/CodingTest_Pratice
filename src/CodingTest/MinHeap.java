package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class MinHeap {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // 우선순위가 낮은 숫자순
		for(int i = 0;i<n;i++) {
			int x = Integer.parseInt(br.readLine());
			if(pq.isEmpty() && x==0) { // 큐가 비어있고, 0값이 들어오면
				pq.offer(x);
				sb.append(pq.poll()).append("\n");
			}else if(x==0) { // 큐는 안 비어있는데 0이 들어오면
				sb.append(pq.poll()).append("\n");
			}
			if(x!=0) { // 들어온 값이 0이 아니면
				pq.offer(x); 
			}
		}
		System.out.println(sb);
	}

}
