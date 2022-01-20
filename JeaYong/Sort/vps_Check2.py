vps = list() #vps 확인을 위한 리스트

while True:
    check = True    # vps가 맞는지 확인을 위한 변수
    line = input()  # 입력받는 문자열

    if line == '.': # .을 입력받으면 while문 종료
        break

    for i in range(len(line)): # 입력받은 라인 크기 만큼 반복

        if line[i] == '(' or line[i] == '[': # '('이나 '['를 찾으면 vps에 저장
            vps.append(line[i])

        elif line[i] == ')':      # ')'를 찾았을 경우
            if len(vps) == 0:     # vps의 크기가 0이면 check를 false로 설정 후 for문을 나간다
                check = False
                break
            elif vps[-1] == '[':  # '['이면 check를 false로 설정 후 for문을 나간다
                check = False
                break
            elif vps[-1] == '(':  # '('이면 vps 리스트를 pop한다
                vps.pop()

        elif line[i] == ']':      # ']'를 찾았을 경우
            if len(vps) == 0:     # vps의 크기가 0이면 check를 false로 설정 후 for문을 나간다
                check = False
                break
            elif vps[-1] == '[':  # '['이면 vps 리스트를 pop한다
                vps.pop()
            elif vps[-1] == '(':  # '('이면 check를 false로 설정 후 for문을 나간다
                check = False
                break

    if len(vps) == 0 and check == True:  # vps의 크기가 0이고 check가 true이면 yes 출력
        print("yes")
    elif check == False:                 # check가 false이면 no 출력
        print("no")
    else:                                # 나머지 모든 경우는 no 출력
        print("no")

    vps.clear()   # vps 배열을 비워준다



