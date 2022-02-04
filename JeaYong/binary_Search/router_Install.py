import sys

N, C = map(int, sys.stdin.readline().split())

house = []

for i in range(N):
    spot = int(sys.stdin.readline())

    house.append(spot)

house.sort()

start = 1
end = house[-1] - house[0]

while end >= start:
    mid = int((start + end) / 2)
    current = house[0]
    count = 1

    for i in range(len(house)):
        if house[i] >= mid + current:
            current = house[i]
            count = count + 1

    if count < C:
        end = mid - 1
    else:
        ans = mid
        start = mid + 1

print(ans)