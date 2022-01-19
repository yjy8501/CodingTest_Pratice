def solution(s):
    """
    :param s: 괄호문자열
    :return: 올바른 문자열의 개수

    문자열의 길이 만큼 회전 시켰을 때
    몇번 올바른 문자열이 되는가
    """

    ficount = 0  # 몇번 올바른 문자열이 되는지

    n = 0  # 회전을 시키기 위해 만든 변수
    a = list(s)  # 받아온 문자열을 리스트로 만든다
    while n < len(s):  # 입력 받은 문자열 길이 만큼 회전 시킨다
        if n > 0:  # 처음은 회전 안 하니까 다음부터 회전 시킨다
            a.append(a.pop(0))  # 맨 앞을 하나 빼고 맨 뒤에 붙힌다

        stack = []  # 괄호들을 저장 하기 위해 만듬
        for i in a:  # 하나하나 받아온다
            if i == "(" or i == "[" or i == "{":  # 시작 괄호면 스택에 저장한다
                stack.append(i)
            elif i == ")":  # ) 면
                if len(stack) > 0 and stack[-1] == "(":  # 스택 길이가 0 초과이고 맨 마지막이 ( 면
                    stack.pop()  # 맨 마지막을 뺀다
                else:  # 다른 것이면 스택에 i를 추가 한다
                    stack.append(i)
                    break
            elif i == "]":  # # 스택 길이가 0 초과이고 맨 마지막이 [ 면
                if len(stack) > 0 and stack[-1] == "[":  # 맨 마지막을 뺀다
                    stack.pop()
                else:  # 다른 것이면 스택에 i를 추가 한다
                    stack.append(i)
                    break
            elif i == "}":  # 스택 길이가 0 초과이고 맨 마지막이 { 면
                if len(stack) > 0 and stack[-1] == "{":  # 맨 마지막을 뺸다
                    stack.pop()
                else:  # 다른 것이면 스택에 i를 추가 한다
                    stack.append(i)
                    break

        if len(stack) == 0:  # 스택의 길이가 0 이면 모두 짝이 맞아 떨어지는 것임으로
            ficount += 1  # 올바른 문자열을 세는 변수에 1 추가한다
        n += 1
    return ficount
