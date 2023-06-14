cnt = [[] for _ in range(12)]
cnt[0].append("")
cnt[1].append("1")
for i in range(2, 12):
    for j in range(1, 4):
        if i >= j:
            for k in cnt[i - j]:
                if k + str(j) not in cnt[i]:
                    cnt[i].append(k + str(j))
                if str(j) + k not in cnt[i]:
                    cnt[i].append(str(j) + k)
t = int(input())
for _ in range(t):
    n = int(input())
    print(len(cnt[n]))
