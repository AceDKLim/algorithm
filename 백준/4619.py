# b에 가까운 a**n 찾기
while 1:
    b, n = map(int, input().split())
    if b == 0 and n == 0:
        break
    result = 1
    for a in range(2, b):
        if abs(b - a**n) < abs(b - result**n):
            result = a
    print(result)
