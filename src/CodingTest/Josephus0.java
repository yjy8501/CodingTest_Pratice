package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus0 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i<=n;i++) { // 1부터 n까지의 값을 넣어준다
			queue.offer(i);
		}
		while(!queue.isEmpty()) {//큐가 비어있지 않을때까지
			for(int i = 0;i<k-1;i++) {//k-1만큼 삭제 1번, 삭제한 값 다시 추가 한번씩 해준다.
			int temp = queue.poll();
			queue.offer(temp);
			}
			list.add(queue.poll());//한번 더 삭제한 값을 list에 넣어준다.(즉 3(K)번째의 값을 넣어준다)
		}
		//출력
		System.out.print("<");
		for(int i = 0;i<list.size();i++) {
			if(i==list.size()-1) {
				System.out.print(list.get(i)+">");
			}else {
				System.out.print(list.get(i)+", ");
			}
		}
	}

}