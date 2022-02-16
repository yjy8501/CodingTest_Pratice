import sys
from collections import deque

N, M = map(int, sys.stdin.readline().split())

sequence = []
queue = deque()


def dfs(start):
    if len(sequence) == M:
        print(' '.join(map(str, sequence)))
        return

    for i in range(start, N + 1):
        if i not in sequence:
            sequence.append(i)
            dfs(i + 1)
            sequence.pop()


dfs(1)