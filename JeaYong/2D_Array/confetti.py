x_point = list() # x좌표를 저장 할 리스트
y_point = list() # y좌표를 저장 할 리스트

N = int(input()) # 색종이의 개수

for i in range(N):
    x, y = map(int, input().split())
    x_point.append(x)
    y_point.append(y)

page = [[0 for col in range(max(x_point) + 10)] for row in range(max(y_point) + 10)] # 도화지의 크기만큼 2차원 배열을 생성한다

for i in range(N): # 색종이 범위 만큼 page배열을 1로 바꿔준다.
    for row in range(y_point[i] - 1, y_point[i] + 9):
        for col in range(x_point[i] - 1, x_point[i] + 9):
            page[row][col] = 1

area = 0 # 색종이의 범위

for i in page: # page배열의 1의 개수를 area에 저장한다
    area += i.count(1)

print(area)
