import math

N = int(input()) # N을 입력받는다

side = int(math.pow(2, N)) # N번 이후의 변의 길이

side_point = side + 1 # 한 변의 원의 개수

print(side_point * side_point)