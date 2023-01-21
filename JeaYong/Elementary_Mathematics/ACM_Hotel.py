T = int(input())

for i in range(T):
    H, W, N = map(int, input().split())

    if N % H == 0:
        a = int(N / H)
        b = H * 100
    else:
        a = int(N / H) + 1
        b = (N % H) * 100
    print(a+b)