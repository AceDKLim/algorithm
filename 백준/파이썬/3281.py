from collections import deque

alpha = {"ABC": 2, "DEF": 3, "GHI": 4, "JKL": 5, "MNO": 6, "PQRS": 7, "TUV": 8, "WXYZ": 9}

n = int(input())
text = list(input() for _ in range(n))
a = []
for t in text:
    p = ""
    for i in t:
        for j in alpha.keys():
            for k in j:
                if k == i:
                    p += str(alpha[j])
                    break
    a.append(p)

m = int(input())
b = "".join(input().split()).split("1")
for i in range(len(b)):
    if b[i] in a:
        b[i] = text[a.index(b[i])]
    else:
        b[i] = "*" * len(b[i])

print(*b, sep=" ")
