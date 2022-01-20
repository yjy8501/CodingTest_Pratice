t = int(input())                         # 수열의 크기
number = list(map(int, input().split())) # 수열의 값 배열
temp = list()                            # 수열의 인덱스를 저장할 배열
NGE = list()                             # 오큰수 배열
for i in range(t):                       # 오큰수 초기값을 전부 -1로 초기화
    NGE.append(-1)

for i in range(t):                       # 수열의 크기 만큼 반복
    if i == 0:                           # 처음 시작할 때 temp에 0 저장
        temp.append(i)

    if number[temp[-1]] >= number[i]:    # 왼쪽에 있는 수가 오른쪽에 있는 수보다 크거나 같을 때
        temp.append(i)                   # 오른쪽에 있는 수의 인덱스를 temp에 저장
    elif number[temp[-1]] < number[i]:   # 왼쪽에 있는 수가 오른쪽에 있는 수보다 작을 때
        while True:
            NGE[temp.pop()] = number[i]                          # 왼쪽 오큰수 배열에 오른쪽 값을 저장
            if len(temp) == 0 or number[temp[-1]] >= number[i]:  # temp 배열이 비어있거나 다음 temp값이 오른쪽 값보다 크면
                temp.append(i)                                   # 오른쪽 값도 temp에 저장
                break

for i in NGE: # 값 출력
    print(i, end=' ')