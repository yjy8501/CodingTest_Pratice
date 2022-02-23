import sys
from collections import deque

sys.setrecursionlimit(10**6)
N = int(sys.stdin.readline())
graph = [[] for _ in range(N + 1)]
parent = deque(0 for _ in range(N + 1))


def dfs(start):
    for i in graph[start]:
        if parent[i] == 0:
            parent[i] = start
            dfs(i)


for _ in range(N - 1):
    x, y = map(int, sys.stdin.readline().split())

    graph[x].append(y)
    graph[y].append(x)

dfs(1)
parent.popleft()
parent.popleft()
print(' '.join(map(str, parent)))
