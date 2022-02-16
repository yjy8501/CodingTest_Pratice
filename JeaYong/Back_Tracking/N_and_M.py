import sys

N, M = map(int, sys.stdin.readline().split())

sequence = list()


def dfs():
    if len(sequence) == M:
        print(' '.join(map(str, sequence)))
        return

    for i in range(1, N + 1):
        if i not in sequence:
            sequence.append(i)
            dfs()
            sequence.pop()


dfs()
