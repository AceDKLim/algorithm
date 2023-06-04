i = 1
while 1:
    a, b, c = map(int, input().split())
    if a == 0 and b == 0 and c == 0:
        break
    print(f"Triangle #{i}")
    result = "Impossible."
    if a == -1:
        if c > b:
            result = f"a = {(c**2-b**2)**0.5:0.3f}"
    elif b == -1:
        if c > a:
            result = f"b = {(c**2-a**2)**0.5:0.3f}"
    elif c == -1:
        result = f"c = {(a**2+b**2)**0.5:0.3f}"
    print(result)
    i += 1
    print()
