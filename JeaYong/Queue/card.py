from collections import deque

N = int(input())              # N 입력
card = deque(range(1,N+1,1))  # 1부터 N까지의 카드
count = 0                     # 반복 순서를 나누기 위한 변수

while True:
    if len(card) == 1:        # card 큐가 1개 남으면 while문을 벗어난다
        break

    if count % 2 == 0:               # 짝수일 경우 첫번째 카드를 버린다
        card.popleft()
    else:
        card.append(card.popleft())  # 홀수일 경우 첫번째 카드를 맨 뒤로 보낸다

    count = count + 1                # 반복 순서 횟수를 올려준다

print(card.pop()) # 마지막 남은 카드를 출력한다