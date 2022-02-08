import sys
from collections import deque


def bfs(graph, x, y):
    queue = deque()
    queue.append((x, y))
    graph[x][y] = 0
    count = 1

    while queue:
        q, w = queue.popleft()

        for o in range(4):
            nx = q + dx[o]
            ny = w + dy[o]

            if nx < 0 or nx >= N or ny < 0 or ny >= N:
                continue
            if graph[nx][ny] == '1':
                graph[nx][ny] = 0
                queue.append((nx, ny))
                count = count + 1
    apt.append(count)


N = int(sys.stdin.readline())
graph = [[] * N for _ in range(N)]
apt = []

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

for i in range(N):
    line = sys.stdin.readline()
    graph[i] = list(line)

for j in range(len(graph)):
    for h in range(len(graph[j])):
        if graph[j][h] == '1':
            bfs(graph, j, h)

apt.sort()

print(len(apt))

for k in apt:
    print(k)
