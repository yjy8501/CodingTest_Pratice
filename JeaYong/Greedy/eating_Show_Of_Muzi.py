# food_times -> 음식을 먹는데 필요한 시간
# K -> k초 후 네트워크 장애

food_times = list(map(int, input().split()))    # 음식 배열
k = int(input())                # 시간
length = len(food_times)        # 음식 배열 크기
count = 0                       # food_times의 인덱스를 가르킬 수
total_count = 0                 # 무지가 음식을 먹은 횟수 == 먹는데 걸린 시간
result = 0                      # 결과값

while True:

    if food_times[count] != 0:  # 음식 배열의 값이 0이 아니면
        food_times[count] -= 1  # 음식을 먹고
        count += 1              # food 인덱스의 크기를 증가시키고
        total_count += 1        # 음식을 먹는데 걸린 시간 증가
    else:
        count += 1              # 음식 배열 값이 0이면 인덱스 증가

    if result == length:        # 결과값이 배열의 크기과 같아지면 1로 초기화
        result = 1
    else:                       # 결과값 = 지금 인덱스 + 1
        result = count + 1

    if total_count == k:        # 무지가 음식을 먹는데 걸린 시간 == k초 while문 탈출
        break
    if count == length:         # 인덱스와 배열의 크기가 같아지면 인덱스를 0으로 초기화
        count = 0

print(result)                   # 결과값 출력