a = int(input())

sum = 1
count = 1
while True:
    if a <= sum:
        print(count)
        break

    else:
        sum += 6 * count
        count += 1