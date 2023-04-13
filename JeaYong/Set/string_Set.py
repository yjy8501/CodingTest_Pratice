import sys

S = set() # S 집합을 만들어준다
count = 0 # M개의 문자열 중 S에 속한 문자열의 개수

N, M = map(int, sys.stdin.readline().split())

for i in range(N): # S 집합의 문자열을 입력받는다
    Str = sys.stdin.readline().strip()

    S.add(Str)

for i in range(M): # S 집합 안에 있는 문자열인지 확인한다
    Str = sys.stdin.readline().strip()

    if Str in S:
        count += 1

print(count) # 일치하는 총 개수를 출력한다