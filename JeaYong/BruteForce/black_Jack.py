N, M = map(int, input().split())
card = list(map(int, input().split()))

big = 0
for i in range(0, N - 2):
    for j in range(1 + i, N - 1):
        for k in range(1 + j, N):
            temp = card[i] + card[j] + card[k]
            if big < temp <= M:
                big = temp
print(big)
