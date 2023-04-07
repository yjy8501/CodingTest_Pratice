numbers = list()
signs = ["+"]
n = ""

expression = input()

for i in expression:
    if i == "-" or i == "+":
        signs.append(i)
        numbers.append(n)
        n = ""

    else:
        n += i

numbers.append(n)

plus = 0
minus = 0

flag = True

for i in range(len(numbers)):
    if signs[0] == "-":
        signs.pop(0)
        minus += int(numbers.pop(0))
        flag = False

    else:

        if not flag:
            signs.pop(0)
            minus += int(numbers.pop(0))
        elif flag:
            signs.pop(0)
            plus += int(numbers.pop(0))

print(plus-minus)