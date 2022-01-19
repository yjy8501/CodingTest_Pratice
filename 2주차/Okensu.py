import sys

n = int(sys.stdin.readline())
# 수열 크기 입력 받음

li = list(map(int, sys.stdin.readline().split()))
# 수열을 입력 받음

stack = []  # 원하는 수 보다 큰 수들을 저장 하기 위한 리스트
fili = []  # 총 결과를 저장 하기 위한 리스트

for i in range(n):  # 입력받은 수열 크기 만큼 돌 때
    for j in range(i, n):  # i 부터 끝까지 돌면서
        if li[i] < li[j]:  # 수열의 i번째가 수열의 j 번째 보다 작을 때
            stack.append(li[j])  # 큰 수를 리스트에 저장

    if len(stack) == 0:  # 스택 길이가 0이면
        fili.append(-1)  # 큰수가 없거나 비교 대상이 없는 뜻이다
    else:  # 길이가 0이 아니면
        fili.append(stack[0])  # 큰수중 제일 왼쪽을 결과 리스트에 저장

    stack = []  # 스택 리스트 초기화

for i in fili:  # 결과 출력
    print(i, end=" ")
