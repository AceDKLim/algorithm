text = "UCPC"
result = ""

cnt = 0
string = input()
for i in string:
    if i == text[cnt]:
        cnt += 1
        result += i
    if cnt == 4:
        break
if result == text:
    print("I love UCPC")
else:
    print("I hate UCPC")
