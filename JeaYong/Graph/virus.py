import sys
from collections import deque

N = int(sys.stdin.readline())
V = int(sys.stdin.readline())

graph = [[] for _ in range(N + 1)]
visited = [0] * (N + 1)


def bfs(s):
    count = 0
    queue = deque()
    queue.append(s)
    visited[s] = 1

    while queue:
        v = queue.popleft()
        count += 1

        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = 1
    return count


for _ in range(V):
    start, end = map(int, sys.stdin.readline().split())

    graph[start].append(end)
    graph[end].append(start)

count = bfs(1)
print(count - 1)