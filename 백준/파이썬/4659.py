mo = list("aeiou")
while 1:
    n = input()
    if n == "end":
        break
    result = True

    for i in range(len(n) - 2):
        if (n[i] not in mo and n[i + 1] not in mo and n[i + 2] not in mo) or (
            n[i] in mo and n[i + 1] in mo and n[i + 2] in mo
        ):
            result = False
            break
        if (n[i] != "e" and n[i] != "o") and n[i] == n[i + 1]:
            result = False
            break

    if len(n) >= 2 and n[-2] == n[-1] and (n[-1] != "e" and n[-1] != "o"):
        result = False

    cnt = 0
    for m in mo:
        if m in n:
            cnt += 1
    if cnt == 0:
        result = False

    if result:
        print(f"<{n}> is acceptable.")
    else:
        print(f"<{n}> is not acceptable.")
