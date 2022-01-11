def solution(food_times, k):
    """
    :param food_times: 각 음식을 모두 먹는데 필요한 시간이 음식의 번호 순서대로 들어있는 배열
    :param k: 방송이 중단 된 시간
    :return: 장애 복구 후 몇번 부터 다시 먹기 시작하면 되는지
    """
    sum = 0

    for i in food_times:
        sum += i

    if sum <= k:  # 방송이 중단 된 시간이 총합 보다 크면 중단 되고 먹을게 없기 때문
        return -1

    i = 0  # 먹는 순서 위치
    count = 0  # 시간

    while i <= len(food_times):  # i가 먹을 음식들의 리스트 길이보다 작거나 같다면
        if count == k:  # 시간이 인터럽과 같으면 빠져 나간다
            i = i % len(food_times)  #
            break

        i = i % len(food_times)
        # 먹는 위치 재설정한다 만약 먹는 위치가 끝까지 갔다면 전체길이로 나누고 몫을 구한뒤 넣어준다

        if food_times[i] != 0:  # 먹는 위치가 0이 아니면
            food_times[i] -= 1  # 음식량 - 1
        else:  # 먹는 위치가 0이면
            i += 1  # 먹는 위치를 하나 올리고
            continue  # 다시 반복문을 돌린다

        i += 1  # 먹는 위치 옮긴다
        count += 1  # 시간 1을 추가한다

    return food_times[i]  # 결과를 리턴한다


print(solution([3, 1, 2], 5))  # 함수 호출
