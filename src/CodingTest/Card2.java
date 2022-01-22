package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card2{
	public static void main(String[] args) throws IOException{
		Queue<Integer> queue = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1;i<=n;i++) { // 값을 넣어준다.
			queue.offer(i);
		}
		while(queue.size()!=1) { // 큐의 크기가 1이 아닐때까지
			queue.poll(); // 가장 앞의 값을 버린다.
			int temp = queue.poll(); // 그 다음 값을 temp에 저장한다.
			queue.offer(temp); // temp를 다시 넣어준다.
		}
		System.out.println(queue.peek()); // queue의 첫번째 값을 보여준다.
	}

}

