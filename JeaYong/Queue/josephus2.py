import sys
from collections import deque

N, K = map(int, input().split())       # N명의 사람, K번째 제거

sequence = deque(range(1,N+1,1))       # 1부터 N까지의 사람 수열
josephus = ''                          # 요세푸스를 순열을 출력하기 위한 변수

while True:
    if len(sequence) == 0:             # sequence 데큐가 비면 while문을 벗어난다
        break

    sequence.rotate(-K+1)                          # K-1 만큼 왼쪽으로 회전
    josephus = josephus + str(sequence.popleft())  # 요세푸스 순열에 더해준다
    if len(sequence) >= 1:
        josephus = josephus + ', '                 # sequence가 1 이상이면 ,를 더해준다
    else:
        continue

sys.stdout.write('<'+josephus+'>')       # 요세푸스 순열을 출력한다

