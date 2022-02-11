package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato1 {
	static int n;
	static int m;
	static int[][] tomato;
	static int max;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,1,-1};
	static Queue<int[]> q;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		tomato = new int[n][m];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<m;j++) {
				tomato[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		q = new LinkedList<int[]>();
		//토마토 밭에서 1을 발견하면 큐에 추가(이 과정을 통해서 어디서부터 출발할지를 정한다.)
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(tomato[i][j]==1) {
					q.offer(new int[] {i,j});
				}
			}
		}
		bfs();
	}
	static void bfs() {
		while(!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			for(int i = 0;i<4;i++) {
				int nextX = nowX+dx[i];
				int nextY = nowY+dy[i];
				if(nextX < 0 || nextY < 0 || nextX > n-1 || nextY > m-1) { // 범위를 벗어나면 continue
					continue;
				}
				if(tomato[nextX][nextY] != 0) continue; // 토마토가 없거나 익은 토마토라면 continue
				else // 그렇지 않은 경우에는 큐에 다음 칸 갱신 후 다음 칸 인덱스 추가
					tomato[nextX][nextY] = tomato[nowX][nowY]+1;
					q.offer(new int[] {nextX,nextY});
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(tomato[i][j]==0) { // 끝까지 안 익은 토마토가 존재한다면 -1출력 후 종료
					System.out.println(-1);
					System.exit(0);
				}	
				max = Math.max(max, tomato[i][j]); // max(일수)에는 지나간 일수 계속 넣기
			}
			
		}
		System.out.println(max-1); // 다 익었다면 일수 출력
	}


}
