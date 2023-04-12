import sys

unHeard = set()
unSeeing = set()

N, M = map(int, input().split())

for i in range(N):
    people = sys.stdin.readline().rstrip()

    unHeard.add(people)

for i in range(M):
    people = sys.stdin.readline().rstrip()

    unSeeing.add(people)

result = unSeeing.intersection(unHeard)
result = sorted(result)

print(len(result))
for i in result:
    print(i)