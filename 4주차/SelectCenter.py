import sys, heapq

left = []
right = []

for _ in range(int(sys.stdin.readline())):  # 정수의 개수 입력 받고 그 만큼 돌린다
    a = int(sys.stdin.readline())  # 정수를 입력 받는다

    if len(left) == len(right):  # 왼쪽 힙과 오른쪽 힙의 길이가 같다면
        heapq.heappush(left, (-a, a))  # 왼쪽에 최대 힙으로 넣는다
    else:
        heapq.heappush(right, (a, a))  # 다르다면 오른쪽에 최소 힙으로 넣는다

    if right and left[0][1] > right[0][1]:
        # 오른쪽 힙에 내용이 있고 왼쪽 힙의 첫번째가 오른쪽 힙 첫번째 보다 크다면
        left[0], right[0] = right[0], left[0]  # 서로 교환을 해준다
    print(left[0][1])  # 결과 출력
