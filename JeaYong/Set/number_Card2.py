card = dict() # 상근이가 가지고 있는 숫자 카드
result = list() # 상근이가 숫자 카드 몇개 가지고 있는지

N = int(input())

num = map(int, input().split())

for i in num: # 키, 값 형식으로 [숫자 : 숫자 카드 개수]를 저장해준다
    if i in card:
        card[i] = card[i] + 1
    else:
        card[i] = 1

M = int(input())

num2 = map(int, input().split())

for i in num2: # 상근이가 가지고 있는 숫자 카드의 개수를 result에 저장한다
    if i in card:
        result.append(card[i])
    else:
        result.append(0)

for i in result:
    print(i, end=" ")