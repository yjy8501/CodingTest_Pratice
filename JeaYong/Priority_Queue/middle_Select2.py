import heapq
import sys

N = int(sys.stdin.readline())

max_Heap = []
min_Heap = []

for i in range(N):
    num = int(sys.stdin.readline())

    if len(max_Heap) == len(min_Heap):
        heapq.heappush(max_Heap, (-num, num))
    else:
        heapq.heappush(min_Heap, (num, num))

    if min_Heap and max_Heap[0][1] > min_Heap[0][1]:
        max_Value = heapq.heappop(max_Heap)
        min_Value = heapq.heappop(min_Heap)

        heapq.heappush(max_Heap, (-min_Value[1], min_Value[1]))
        heapq.heappush(min_Heap, (max_Value[1], max_Value[1]))

    ans = max_Heap[0][1]
    print(ans)



