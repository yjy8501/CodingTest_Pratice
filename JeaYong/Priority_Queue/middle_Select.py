import heapq
import sys

N = int(input())
sequence = []

for i in range(N):
    num = int(sys.stdin.readline())

    heapq.heappush(sequence, num)
    second = list(sequence)
    heapq.heapreplace(second, num)
    print(second)

    if len(sequence) == 1:
        print(sequence[0][1])

    elif len(sequence) % 2 == 0:
        for j in range(int(len(sequence) / 2)):
            ans = heapq.heappop(second)
        print(ans[1])
    else:
        for j in range(int(len(sequence) / 2) + 1):
            ans = heapq.heappop(second)
        print(ans[1])
