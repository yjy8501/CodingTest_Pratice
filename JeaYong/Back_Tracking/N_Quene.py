import sys

N = int(sys.stdin.readline())

point = [0] * N
count = 0


def check(start):
    for i in range(start):
        if point[start] == point[i] or abs(point[start] - point[i]) == abs(start - i):
            return False
    return True


def dfs(start):
    global count
    if start == N:
        count += 1
        return

    for k in range(N):
        point[start] = k
        if check(start):
            dfs(start + 1)


dfs(0)
print(count)
