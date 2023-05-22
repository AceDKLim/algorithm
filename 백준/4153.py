while 1:
    a, b, c = map(int, input().split())
    if a + b + c == 0:
        break
    else:
        a, b, c = a**2, b**2, c**2
        if max(a, b, c) == a + b + c - max(a, b, c):
            print("right")
        else:
            print("wrong")
