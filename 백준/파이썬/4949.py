while 1:
    l = []
    s = input()
    r = "yes"
    if s == ".":
        break
    elif s[-1] != ".":
        r = "no"
    else:
        for i in s:
            if i == "[" or i == "(":
                l.append(i)
            elif i == ")":
                if len(l) != 0 and l[-1] == "(":
                    l.pop()
                else:
                    r = "no"
                    break
            elif i == "]":
                if len(l) != 0 and l[-1] == "[":
                    l.pop()
                else:
                    r = "no"
                    break
    if len(l) != 0:
        r = "no"
    print(r)
