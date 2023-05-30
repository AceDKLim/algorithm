while 1:
    ment = input()
    p = 0
    if ment == "END":
        break
    for i in ment:
        if i != " " and ment.count(i) > 1:
            p = 1
            break
    if p == 0:
        print(ment)
