
t = int(input()) # 테스트 횟수 입력
vps = list()     # vps를 확인하는 리스트

for i in range(t): #테스트 케이스 만큼 반복
    ps = input();  #ps 문자열 입력받는다

    for j in range(len(ps)):  #ps 문자열 만큼 반복

        if ps[j] == '(':      #ps[j]가 '(' 이면 vps 리스트에 추가
            vps.append(ps[j])

        else:
            if len(vps) == 0:      #vps 리스트가 빈 리스트이면 ')' 추가
                vps.append(ps[j])

            elif vps[-1] == '(':   #vps 리스트의 마지막에 추가된 문자열이 (이면 pop
                vps.pop()
            else:
                vps.append(ps[j])  #vps 리스트에 ')' 추가

    if len(vps) == 0:  #리스트가 비어 있으면 YES 출력
        print('YES')
    else:              #리스트가 남아 있으면 NO 출력
        print('NO')

    vps.clear() #배열을 비워준다