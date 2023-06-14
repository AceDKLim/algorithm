cnt = 0
for i in range(8):
    t = input()
    n = i % 2
    for j in range(n, 8, 2):
        if t[j] == "F":
            cnt += 1
print(cnt)
