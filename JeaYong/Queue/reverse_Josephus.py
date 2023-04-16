import sys
from collections import deque


def josephus(N, K, M):

    flag = True
    people = deque(range(1, N + 1))

    for i in range(1, N + 1):

        if flag:
            people.rotate(-(K-1))
            print(people.popleft())
        else:
            people.rotate(K)
            print(people.popleft())

        if i % M == 0: # M번 사람이 제거 될 때 방향을 바꿔준다
            if flag:
                flag = False
            else:
                flag = True


N, K, M = map(int, sys.stdin.readline().split())

josephus(N, K, M)



