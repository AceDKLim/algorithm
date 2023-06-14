while 1:
    try:
        lower = 0
        upper = 0
        blank = 0
        number = 0
        n = input()
        for i in n:
            if i == " ":
                blank += 1
            elif ord(i) >= ord("a") and ord(i) <= ord("z"):
                lower += 1
            elif ord(i) >= ord("A") and ord(i) <= ord("Z"):
                upper += 1
            elif ord(i) >= ord("0") and ord(i) <= ord("9"):
                number += 1
        print(lower, upper, number, blank)
    except:
        break
