import copy
import sys

compressed_X = dict() # 압축 좌표를 저장할 딕셔너리

N = int(input())

X = list(map(int, sys.stdin.readline().split()))
copy_X = copy.deepcopy(X) # 본래 좌표 순서가 저장된 배열

X = sorted(set(X)) # 좌표를 집합에 넣어 중복값을 없애고, 정렬한다

for i in range(len(X)):
    compressed_X[X[i]] = i # 본래 좌표(key) 압축 좌표(value)로 딕셔너리에 저장한다

for i in copy_X:
    print(compressed_X[i], end=' ')