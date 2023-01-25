import math


def check_prime(num):
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True


while True:
    N = int(input())

    if N == 0:
        break

    count = 0
    for i in range(N + 1, (2 * N) + 1):
        if check_prime(i):
            count += 1
    print(count)
