# N -> 배열의 크기
# M -> 더하는 횟수
# K -> 연속되는 인덱스가 나올 수 있는 횟수

n, m, k = map(int, input().split())
index = list(map(int, input().split()))

count = 0 # 더해지는 횟수 카운트
result = 0 # 결과값

index.sort(reverse=True) # index 내림차순 정렬

while True:
    result += index[0]
    count += 1

    if (count % k) == 0: # 큰 수가 3번 더해지면
        result += index[1] # 두번째로 작은 수 더하기
        count += 1
    if count == m: # m 만큼 실행되면 반복문 종료
        break

print(result) # 결과값 출력