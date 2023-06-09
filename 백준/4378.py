key1 = list("`1234567890-=")
key2 = list("QWERTYUIOP[]\\")
key3 = list("ASDFGHJKL;'")
key4 = list("ZXCVBNM,./")

while 1:
    try:
        n = input()
        result = ""
        for i in n:
            if i == " ":
                result += " "
            if i in key1:
                result += key1[key1.index(i) - 1]
            elif i in key2:
                result += key2[key2.index(i) - 1]
            elif i in key3:
                result += key3[key3.index(i) - 1]
            elif i in key4:
                result += key4[key4.index(i) - 1]
        print(result)
    except:
        break
