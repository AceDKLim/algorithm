cnt = 1
while 1:
    try:
        r, b, c = map(int, input().split())
        n = ((b**2 + c**2) ** 0.5) / 2
        if r >= n:
            print(f"Pizza {cnt} fits on the table.")
        else:
            print(f"Pizza {cnt} does not fit on the table.")
        cnt += 1
    except:
        break
