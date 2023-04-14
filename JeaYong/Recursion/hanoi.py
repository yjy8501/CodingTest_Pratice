import sys

exe = list() # 수행 과정을 저장할 리스트


def hanoi(n, start, mid, to): # 옮길 장대 개수, 시작 부분, 중간 부분, 도착 부분
    if n == 1: # 장대 개수가 1개면 출력
        exe.append(start + " " + to)
        return

    # 1에서 2로 n-1개 만큼 옮긴다
    hanoi(n - 1, start, to, mid)

    # 1에서 3으로 제일 큰 장대를 옮긴다
    exe.append(start + " " + to)

    # 2에서 3으로 n-1개 만큼 옮긴다
    hanoi(n - 1, mid, start, to)


N = int(sys.stdin.readline())

hanoi(N, '1', '2', '3')

print(len(exe))
for i in exe:
    print(i)
