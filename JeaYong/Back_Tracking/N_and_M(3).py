import sys

N, M = map(int, sys.stdin.readline().split())
sequence = []


def dfs():
    if len(sequence) == M:
        print(' '.join(map(str, sequence)))
        return

    for i in range(1, N + 1):
        sequence.append(i)
        dfs()
        sequence.pop()


dfs()