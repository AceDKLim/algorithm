result = 0
s = ""
while 1:
    try:
        s += input()
    except:
        s = list(map(int, s.split(",")))
        for i in s:
            result += i
        print(result)
        break
