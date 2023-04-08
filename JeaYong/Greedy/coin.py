coins = list() # 동전의 종류를 입력 받을 리스트
count = 0 # 동전의 개수

N, money = map(int, input().split()) # 동전의 종류와 돈의 액수를 입력받는다

for i in range(N):
    coin = int(input())

    coins.insert(0, coin) # 동전의 종류를 입력받고 리스트의 앞에 저장한다

for i in range(N): # 최소 동전의 개수를 구한다
    if money >= coins[i]:
        count += int(money / coins[i])
        money = money % coins[i]

print(count)


