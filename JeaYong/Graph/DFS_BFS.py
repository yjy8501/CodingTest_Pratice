import sys
from collections import deque

N, M, V = map(int, sys.stdin.readline().split()) # 정점, 간선, 시작 정점을 입력받는다

graph = [[] for _ in range(N + 1)]               # 그래프 인접 리스트 생성
visited = [0] * (N + 1)                          # DFS 탐색 유무 확인
visited2 = [0] * (N + 1)                         # BFS 탐색 유무 확인


def dfs(s):                # 깊이 우선 탐색

    visited[s] = 1         # 시작 정점 탐색 유무 1
    print(s, end=' ')      # 시작 정점 출력
    for i in graph[s]:     # 시작 정점과 간선을 이루는 정점
        if not visited[i]: # 탐색 유무가 0이라면
            dfs(i)         # 재귀탐색


def bfs(s):                # 넓이 우선 탐색

    queue = deque()        # 데큐 생성
    queue.append(s)        # 데큐에 시작정점 추가
    visited2[s] = 1        # 시작 정점에 탐색유무 1
    while queue:
        v = queue.popleft()       # 데큐 pop
        print(v, end=' ')         # V 출력

        for i in graph[v]:        # 정점 v와 간선을 이루는 정점
            if visited2[i] == 0:  # 탐색 유무가 0이라면
                visited2[i] = 1   # 탐색 유무 1
                queue.append(i)   # 데큐에 정점 추가


for _ in range(M):  # 간선만큼 실행
    start, end = map(int, sys.stdin.readline().split()) # 그래프의 간선을 추가한다

    graph[start].append(end)
    graph[end].append(start)

for i in range(len(graph)): # 그래프의 간선을 정렬해준다
    graph[i].sort()

dfs(V)
print()
bfs(V)
