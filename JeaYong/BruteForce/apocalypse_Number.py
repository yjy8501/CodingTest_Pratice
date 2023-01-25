N = int(input())
count = 0
i = 1

while True:
    if "666" in str(i):
        count += 1

    if count == N:
        print(i)
        break

    i += 1