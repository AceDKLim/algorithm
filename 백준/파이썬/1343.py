bord = list(input())

result = []
cnt = 0
for i in bord:
    if i == "X":
        cnt += 1
    if i == ".":
        if cnt != 0:
            r = -1
            if cnt % 4 == 0:
                result.append("AAAA" * (cnt // 4))
            elif cnt % 4 == 2:
                result.append("AAAA" * (cnt // 4) + "BB")
            elif cnt % 2 == 0:
                result.append("BB" * (cnt // 2))
            else:
                result = -1
                break
        result.append(".")
        cnt = 0

if cnt % 4 == 0:
    result.append("AAAA" * (cnt // 4))
elif cnt % 4 == 2:
    result.append("AAAA" * (cnt // 4) + "BB")
elif cnt % 2 == 0:
    result.append("BB" * (cnt // 2))
else:
    result = -1

if result == -1:
    print(result)
else:
    print("".join(result))
