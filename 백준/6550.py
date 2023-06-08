while 1:
    try:
        s, t = input().split()
        result = ""
        cnt = 0
        for i in t:
            if i == s[cnt]:
                result += i
                cnt += 1
            if s == result:
                break
        if s == result:
            print("Yes")
        else:
            print("No")
    except:
        break
