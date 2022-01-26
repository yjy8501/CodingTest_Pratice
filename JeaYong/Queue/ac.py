from collections import deque

T = int(input())                    # 테스트 케이스를 입력받는다

for i in range(T):                  # 테스트 케이스 만큼 실행
    commend = deque(input())        # 명령어를 입력 받는다
    size = int(input())             # 수열의 크기를 입력받는다
    num_list = (input())            # 수열을 입력받는다
    temp = 'S'                      # 수열의 방향은 정방향으로 초기화

    table = num_list.maketrans({    # 수열에서 [, ] 를 제거한다
        '[': '',
        ']': ''
    })

    num_list = num_list.translate(table)   # 11줄을 실행
    num_list = num_list.split(',')         # ,를 간격으로 수열을 나눈다
    num_list = deque(num_list)             # 수열을 데큐에 넣는다

    while True:

        try:
            first_comd = commend.popleft()     # 맨 앞 명령어를 받는다
            if first_comd == 'R':              # 명령어가 R일 경우
                if temp == 'S':                # 수열의 방향이 정방향이면 역방향으로 설정
                    temp = first_comd
                else:                          # 수열의 방향이 역방향이면 정방향으로 설정
                    temp = 'S'

            elif first_comd == 'D':               # 명령어가 D일 경우
                if temp == 'S':                   # 수열의 방향이 정방향일 경우
                    if num_list.popleft() == '':  # 수열 맨 앞을 pop한다, 만약 빈 공간일 경우 IndexError을 발생
                        raise IndexError
                elif temp == 'R':                 # 수열이 방향이 역방향일 경우
                    if num_list.pop() == '':      # 수열의 맨 뒤를 pop한다, 만약 빈 공간일 경우 IndexError을 발생
                        raise IndexError

        except IndexError as e:                   # IndexError가 발생할 경우 error 출력
            print('error')
            break                                 # while문을 벗어난다

        if len(commend) == 0:                         # 명령어의 데큐가 비었을 경우
            if temp == 'S':                           # 정방향이면 수열을 정방향으로 출력
                print('[' + ','.join(num_list) + ']')
                break
            else:                                     # 역방향이면 수열을 역방향으로 출력
                num_list.reverse()
                print('[' + ','.join(num_list) + ']')
                break
