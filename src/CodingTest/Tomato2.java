package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato2 {
	static int[][][] tomato; // 토마토의 익은 수준을 알려줄 3차원 배열
	static int m; // 가로 
	static int n; // 세로
	static int h; // 토마토 농장의 높이
	static Queue<int[]> q;
	static int max; // 일수
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	static int[] dz = {0,0,1,-1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		tomato = new int[n][m][h];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<m;j++) {
				for(int k = 0;k<h;k++) {
					tomato[i][j][k] = Integer.parseInt(st.nextToken());
				}
			}
		}
		q = new LinkedList<int[]>();
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0;j<m;j++) {
				for(int k = 0;k<h;k++) {
					if(tomato[i][j][k]==1) {
						q.offer(new int[] {i,j,k});
					}
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
			int nowZ = now[2];
			for(int i = 0;i<4;i++) {
				int nextX = nowX+dx[i];
				int nextY = nowY+dy[i];
				int nextZ = nowZ+dz[i];
				if(nextX < 0 || nextY < 0 || nextZ < 0 || nextX > n-1 || nextY > m-1 || nextZ > h-1) continue;
				if(tomato[nextX][nextY][nextZ] != 0) continue;
				else {
					tomato[nextX][nextY][nextZ] = tomato[nowX][nowY][nowZ]+1;
					q.offer(new int[] {nextX,nextY,nextZ});
				}	
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				for(int k =0;k<h;k++) {
					if(tomato[i][j][k]==0) {
						System.out.println(-1);
						System.exit(0);
					}
					max = Math.max(max, tomato[i][j][k]);
				}
			}
		}
		System.out.println(max-1);
	}

}
