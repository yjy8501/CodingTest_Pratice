N = int(input())
flag = False

for i in range(1, N+1):
    if flag:
        break
    sum = 0
    for j in str(i):
        sum += int(j)
    if N == sum + i:
        print(i)
        flag = True
        break
if not flag:
    print(0)