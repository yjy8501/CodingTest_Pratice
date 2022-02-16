import sys
from collections import deque

M, N = map(int, sys.stdin.readline().split())

graph = [[] * M for _ in range(N)]
first = deque()
day = 0
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]


def bfs(graph, day, queue):

    while True:

        sec_queue = deque()
        while queue:
            c, d = queue.popleft()

            for h in range(4):

                nx = c + dx[h]
                ny = d + dy[h]

                if nx < 0 or nx >= N or ny < 0 or ny >= M:
                    continue
                if graph[nx][ny] == '0':
                    sec_queue.append((nx, ny))
                    graph[nx][ny] = '1'

        queue = sec_queue
        if len(sec_queue) == 0:
            for item in graph:
                if '0' in item:
                    return -1
            break
        day = day + 1
    return day


for i in range(N):
    line = sys.stdin.readline().split()
    graph[i] = list(line)

for d in range(len(graph)):
    for s in range(len(graph[d])):
        if graph[d][s] == '1':
            first.append((d, s))

day = bfs(graph, day, first)

print(day)

