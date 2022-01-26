from collections import deque
import sys

n, k = map(int, sys.stdin.readline().split())  # 사람 수, 몇번째 제거 할지 입력 받는다
que = deque(list(i for i in range(1, n+1)))  # 큐에 사람 수 만큼 넣는다
a = []  # 결과 출력을 위한 리스트
while que:  # 큐 만큼 돌 때
    que.rotate(-k + 1)  # k - 1 만큼 큐를 돌린다
    a.append(str(que.popleft()))  # 맨 앞을 때 결과출력 리스트에 문자열 형식으로 넣는다

sys.stdout.write("<" + ", ".join(a) + ">")  # join을 통해 리스트 인덱스 마다 출력문을 합쳐 결과 출력
