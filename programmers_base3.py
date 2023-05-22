def solution(n):
    three = ''
    while n > 0:
        n, r = divmod(n, 3)
        three += str(r)
    answer = int(three, 3)
    return answer
