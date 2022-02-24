import sys

N = int(sys.stdin.readline())
people = {}


for i in range(N):
    kg, height = map(int, sys.stdin.readline().split())

    people[i] = [kg, height]


for i in range(N):
    count = 1
    for j in range(N):
        if i == j:
            continue
        else:
            A = people[i]
            B = people[j]

            if people[i][0] < people[j][0] and people[i][1] < people[j][1]:
                count += 1
            else:
                continue
    print(count, end=' ')



