time_Sum = 0 # 합의 최솟값

N = int(input())

P = list(map(int, input().split())) # 대기 시간을 입력 받는다

P.sort() # 최소 시간 순으로 정렬(그리디)

for i in range(len(P)): # 합의 최솟값을 구한다.
    time_Sum += P[i] * (len(P) - i)

print(time_Sum)
