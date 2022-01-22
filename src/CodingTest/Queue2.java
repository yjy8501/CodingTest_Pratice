package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Queue2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 입력 횟수
		StringTokenizer st;
		
		for(int i = 0;i<n;i++) { 
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {//입력한 토큰에 맞게
			case "push": push(Integer.parseInt(st.nextToken())); break; // push이면 값을 입력하고 넣어준다.
			case "pop": pop(); break;
			case "size": size(); break;
			case "empty": empty(); break;
			case "front": front(); break;
			case "back": back(); break;
			}
		}
		System.out.println(sb); // 출력
	}
	static int[] Queue = new int[2000000]; // 조건이 2000000까지이므로 크기를 2000000으로 설정
	static int size = 0; // 큐의 크기
	static int front = 0; // 큐의 가장 앞 부분
	static int back = 0; // 큐의 가장 뒷 부분
	static StringBuilder sb = new StringBuilder();
	
	public static void push(int n) { // 큐에 가장 뒷 부분에 값을 넣고 큐의 크기와 back의 크기를 증가시킨다.
		Queue[back] = n;
		size++;
		back++;
	}
	public static void pop() { // 큐의 크기가 0이면 -1, 아니면 가장 앞의 수를 삭제 후 큐의 크기를 줄인다.
		if(size==0) {
			sb.append(-1).append("\n");
		}else {
			sb.append(Queue[front]).append("\n");
			size--;
			front++;
		}
	}
	public static void size() { // 현재 큐의 크기 출력
		sb.append(size).append("\n");
	}
	public static void empty() { // 큐가 비어있따면 1 아니면 0 출력
		if(size==0) {
			sb.append(1).append("\n");
		}else {
			sb.append(0).append("\n");
		}
	}
	public static void front() { // 큐의 가장 앞을 출력
		if(size==0) {
			sb.append(-1).append("\n");
		}else {
			sb.append(Queue[front]).append("\n");
		}
	}
	public static void back() { // 큐의 가장 뒤를 출력
		if(size==0) {
			sb.append(-1).append("\n");
		}else {
			sb.append(Queue[back-1]).append("\n");
		}
	}

}
