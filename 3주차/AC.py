import sys
from collections import deque

t = int(sys.stdin.readline())  # 테스트 케이스의 개수

for i in range(t):
    p = sys.stdin.readline()  # 수행할 함수
    n = int(sys.stdin.readline())  # 배열에 들어있는 수의 개수
    que = deque(sys.stdin.readline().rstrip()[1:-1].split(","))  # 배열에 들어있는 정수

    for j in p:  # 수행할 함수를 하나씩 받아온다
        if j == "R":  # R이면 뒤집는다
            que.reverse()

        elif j == "D":  # D이면 큐 길이가 0이 아니면
            if len(que) != 0:  # 맨 앞을 제거 한다
                que.popleft()
            else:  # 0이면 멈춘다
                break
    if len(que) != 0:  # 길이가 0이 아니면 큐 출력
        print(que)
    else:  # 0이면 에러 출력
        print("ERROR")


