from collections import deque

T = int(input()) # 테스트 케이스 입력

for i in range(T):                               # T만큼 반복한다
    N, M = map(int, input().split())             # N M을 입력받는다
    priority = deque(map(int, input().split()))  # 우선순위를 데큐로 입력받는다
    value = deque(range(1, N + 1, 1))            # 정수를 1에서 N까지 데큐에 저장한다
    count = 0                                    # 몇번째 출력인지 세주는 변수
    ans = value[M]                               # M번째의 값

    while True:

        if max(priority) == priority[0]:         # priority의 첫번째 값이 priority의 최댓값과 같을 경우
            priority.popleft()                   # priority 최댓값 pop()
            count = count + 1                    # 출력 횟수 + 1
            if value.popleft() == ans:           # value 최대값 pop()한 후 M번째의 값과 같을 경우 반복문을 벗어난다
                break
            else:
                continue                         # 정수 최대값을 pop()한다
        else:
            priority.append(priority.popleft())  # priority의 첫번째 값을 마지막 값으로 붙힌다
            value.append(value.popleft())        # value의 첫번째 값을 마지막 값으로 붙힌다

    print(count)       # M번째 값이 몇번째에 출력되는지 출력
