alpha = [3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1]
a = input()
b = input()
r = []
for i in range(len(a)):
    r.append(alpha[ord(a[i]) - ord("A")])
    r.append(alpha[ord(b[i]) - ord("A")])

while len(r) > 2:
    t = []
    for i in range(len(r) - 1):
        t.append((r[i] + r[i + 1]) % 10)
    r = t
if len(r) == 2:
    if r[0] == 0:
        print(f"0{r[1]}")
    else:
        print(r[0] * 10 + r[1])
else:
    print(f"0{r[0]}")
