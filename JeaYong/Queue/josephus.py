from collections import deque

N, K = map(int, input().split())      # N명의 사람, K번째 제거

sequence = deque(range(1,N+1,1))      # 1부터 N까지의 사람 수열
josephus = ''                         # 요세푸스를 순열을 출력하기 위한 변수
count = 0                             # K번째 인 걸 확인하기 위한 변수(반복 횟수)

while True:
    if len(sequence) == 0:            # sequence 데큐가 비면 while문을 벗어난다
        break

    count = count + 1                                   # 반복 횟수를 1 더해준다
    if count % K == 0:                                  # K번째 일 경우
        josephus = josephus + str(sequence.popleft())   # 요세푸스 순열에 더한다
        if len(sequence) >= 1:
            josephus = josephus + ', '                  # sequence가 1 이상이면 ,를 더해준다
        else:
            continue

        count = 0                                       # 반복 횟수를 0으로 초기화 해준다
    else:
        sequence.append(sequence.popleft())             # sequence의 첫번째를 맨 마지막으로 붙혀준다

print('<'+josephus+'>')                                 # 요세푸스 순열을 출력한다


