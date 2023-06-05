h = int(input())

result = ""
if h == 0:
    result += "1"
elif h == 1:
    result += "0"
else:
    if h % 2 == 0:
        for i in range(h // 2):
            result += "8"
    else:
        result += "4"
        for i in range(h // 2):
            result += "8"
print(int(result))
