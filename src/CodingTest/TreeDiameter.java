package CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class TreeDiameter {
	static LinkedList<Node> tree[];
    static int distance[], max, index;
    static boolean visit[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        tree = new LinkedList[n+1];
        distance = new int[n+1];
        visit = new boolean[n+1];
        for(int i = 0; i <= n; i++) { // n만큼 새로운 노드 생성
            tree[i] = new LinkedList<>();
        }
        for(int i = 0; i < n-1; i++) { // 트리 입력 받기(입력 받은 값을 트리에 저장)
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken()); // 부모노드
            int c = Integer.parseInt(st.nextToken()); // 자식노드
            int w = Integer.parseInt(st.nextToken()); // 가중치
            tree[p].add(new Node(c, w));
            tree[c].add(new Node(p, w));
        }
        if(n > 1) { // 노드가 1개보다 적을 때
            dfs(1, 0);
            visit = new boolean[n+1];
            distance = new int[n+1];
            dfs(index, 0);
            System.out.println(max);
        }
        else
            System.out.println(0);
    }
    
    public static void dfs(int node, int weight) {
        distance[node] = weight;
        visit[node] = true;
        if(weight > max) { // 주어진 가중치가 max보다 크면 가중치를 max에 대입 / index번호를 가중치에 맞는 간선번호 대입
            max = weight;
            index = node;
        }
        for(Node next : tree[node]) {
            if(!visit[next.number]) // 방문하지 않은 곳이라면 다시 재귀호출
                dfs(next.number, weight + next.weight);
        }
    }
    
    static class Node { // 트리의 간선과 가중치를 담아줄 node 생성
        int number, weight;
        
        Node(int number, int weight) {
            this.number = number;
            this.weight = weight;
        }
    }

}
