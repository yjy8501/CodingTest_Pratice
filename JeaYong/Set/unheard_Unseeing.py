result = dict()
count = 0

N, M = map(int, input().split())

for i in range(N):
    people = input().strip()

    result[people] = False

for i in range(M):
    people = input().strip()

    if people in result:
        result[people] = True
        count += 1

result = dict(sorted(result.items()))

print(count)

for i in result:
    if result[i]:
        print(i)
