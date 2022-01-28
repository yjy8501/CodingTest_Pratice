import heapq
import sys

N = int(sys.stdin.readline())           # N을 입력받는다

sequence = []                           # 숫자를 입력받을 배열

for i in range(N):

    num = int(sys.stdin.readline())     # 숫자를 입력받는다

    if num == 0:                            # 0을 입력받았을 시

        if len(sequence) == 0:              # 배열이 비어있으면
            print(0)                        # 0을 출력
        else:
            print(heapq.heappop(sequence))  # 배열이 비어있지 않다면 최솟값 출력
    else:
        heapq.heappush(sequence, num)       # 최소힙으로 sequence에 저장