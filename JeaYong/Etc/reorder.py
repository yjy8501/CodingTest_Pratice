N, M = map(int, input().split()) # N과 M을 입력받는다

bag = list() # 바구니 리스트를 만들어준다

for i in range(1, N+1): # 바구니 리스트를 만들어준다
    bag.append(i)

for x in range(M): # M만큼 반복한다
    i, j, k = map(int, input().split()) # i, j, k를 입력받는다

    shuffle = bag[i-1 : k-1]  # j 앞까지 바구니 리스트를 슬라이싱 한다

    for y in range(len(shuffle)): # 슬라이싱한 부분을 j 뒤로 붙혀준다
        bag.insert(y+j, shuffle.pop(0))

    del bag[i-1 : k-1] # 슬라이싱 한 부분을 제거한다

print(' '.join(map(str,bag)))



