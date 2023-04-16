import sys
from collections import deque

N, M = map(int, sys.stdin.readline().split())
pop_list = list(map(int, sys.stdin.readline().split()))

rotation_Deque = deque(range(1, N+1))
rotation_Count = 0

for i in range(len(pop_list)):
    left = len(rotation_Deque) # 마지막 원소의 index
    pop_index = rotation_Deque.index(pop_list[i]) # 삭제해야 할 원소의 index

    if pop_index < left - pop_index: # 오른쪽으로 돌려야 할 때
        while True:
            if rotation_Deque[0] == pop_list[i]:
                rotation_Deque.popleft()
                break
            else:
                rotation_Deque.rotate(-1)
                rotation_Count += 1
    else: # 왼쪽으로 돌려야 할 때
        while True:
            if rotation_Deque[0] == pop_list[i]:
                rotation_Deque.popleft()
                break
            else:
                rotation_Deque.rotate(1)
                rotation_Count += 1

print(rotation_Count)

