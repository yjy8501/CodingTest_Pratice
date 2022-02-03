package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RouterInstall {
public static int[] house;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		house = new int[n];
		for(int i = 0;i<n;i++) {
			house[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(house); // 이분탐색을 위한 정렬
		
		int low = 1; // 최소거리의 최솟값
		int high = house[n-1] - house[0]+1; // 최소거리의 최댓값
		
		while(low < high) { 
			int mid = (low + high) / 2; // 중앙위치
			
			if(adjacency(mid) < c) { // 설치가능한 공유기가 m보다 작으면 high값을 중앙위치로 바꿔준다.
				high = mid;
			}else { // 그게 아니면 low 값에 중앙위치+1을 넣어준다.
				low = mid+1;
			}
		}
		System.out.println(low-1);
		
	}
	public static int adjacency(int num) {
		//첫번째 집은 설치하므로 count = 1
		int count = 1;
		int install = house[0];
		
		for(int i = 1;i<house.length;i++) {
			int locate = house[i];
			
			if(locate - install >= num) { // 최소거리보다 크거나 같으면 
				count++; // 횟수 1 증가
				install = locate; // 설치된 집의 위치를 변경
			}
		}
		return count; 
	}


}
