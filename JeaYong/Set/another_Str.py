import sys

result = set() # 부분 문자열이 들어갈 집합

S = sys.stdin.readline().strip() # 문자열을 입력받는다

for i in range(len(S)): # 부분 문자열을 구한다
    for j in range(len(S), 0, -1):
        if i >= j:
            break
        result.add(S[i:j])

print(len(result))
