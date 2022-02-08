import sys
from collections import deque


def bfs(graph, x, y):
    queue = deque()
    queue.append((x, y))
    graph[x][y] = 0

    while queue:
        a, b = queue.popleft()
        for z in range(4):

            nx = a + dx[z]
            ny = b + dy[z]

            if nx < 0 or nx >= M or ny < 0 or ny >= N:
                continue

            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                queue.append((nx, ny))
    return


dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

T = int(sys.stdin.readline())

for _ in range(T):
    M, N, K = map(int, sys.stdin.readline().split())
    graph = [[0] * N for _ in range(M)]
    count = 0
    for _ in range(K):
        x, y = map(int, sys.stdin.readline().split())

        graph[x][y] = 1

    for i in range(len(graph)):
        for j in range(len(graph[i])):
            if graph[i][j] == 1:
                bfs(graph, i, j)
                count += 1

    print(count)
