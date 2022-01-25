t = input()
answer = 0
vps = list()
s = list(t)

for j in range(len(s)):
    print(s)
    for i in range(len(s)):

        if s[i] == '(' or s[i] == '{' or s[i] == '[':
                vps.append(s[i])
        elif s[i] == ')':
            if len(vps) == 0:
                vps.append(s[i])
            elif vps[-1] == '(':
                vps.pop()
            else:
                break
        elif s[i] == '}':
            if len(vps) == 0:
                vps.append(s[i])
            elif vps[-1] == '{':
                vps.pop()
            else:
                break

        elif s[i] == ']':
            if len(vps) == 0:
                vps.append(s[i])
            elif vps[-1] == '[':
                vps.pop()
            else:
                break
    temp = s.pop(0)
    s.append(temp)

    if len(vps) == 0:
        answer = answer + 1
    vps.clear()

print(answer)
