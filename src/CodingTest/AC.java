package CodingTest;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class AC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0;i<T;i++) {
			String P = sc.next();
			int n = sc.nextInt();
			String arr = sc.next();
			Deque<Integer> q = new LinkedList<>();
			// arr배열을 1번 인덱스부터 arr크기-1만큼 ","기준으로 s에 넣는다
			for(String s : arr.substring(1, arr.length()-1).split(",")) { 
				if(!s.equals("")) { // 공백이 아니면 s를 큐에 삽입
					q.offer(Integer.valueOf(s));
				}
			}
			System.out.println(AC(q,P)); // AC함수 사용
		}
		sc.close();
	}
	static String AC(Deque<Integer> q, String s) { // AC함수의 R과 D를 구분해주는 함수
		boolean reverse = false;
		for(char c : s.toCharArray()) { // String s를 char[]로 바꾼 값을 c에 하나씩 넣는다 - ex) RDD R / D / D
			if(c == 'R') {
				reverse = !reverse;
			}else {
				if(q.size()==0) { // 큐의 크기가 0이면 error 출력
					return "error";
				}
				if(reverse == true) {
					q.removeLast(); // 맨 뒷부분 삭제
				}else {
					q.removeFirst(); // 맨 앞 부분 삭제
				}
			}
		}
		StringBuilder sb = new StringBuilder("[");
		while(!q.isEmpty()) {
			sb.append(reverse ? q.removeLast() : q.removeFirst()); // reverse가 true이면 last false이면 first
			if(q.size()!=0) { // 0이 아니면 , 추가
				sb.append(",");
			}
		}
		sb.append("]"); // 마지막에 닫는 기호 추가
		return sb.toString();
	}

}
