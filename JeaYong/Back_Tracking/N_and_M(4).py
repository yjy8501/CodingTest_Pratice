import sys

N, M = map(int, sys.stdin.readline().split())
sequence = []


def dfs(start):
    if len(sequence) == M:
        print(' '.join(map(str, sequence)))
        return

    for i in range(start, N + 1):
        sequence.append(i)
        dfs(i)
        sequence.pop()


dfs(1)
