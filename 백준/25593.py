n = int(input())

work = {}

for _ in range(n):
    l = list(input().split())
    for i in l:
        if i != "-":
            if i in work:
                work[i] += 4
            else:
                work[i] = 4
    l = list(input().split())
    for i in l:
        if i != "-":
            if i in work:
                work[i] += 6
            else:
                work[i] = 6
    l = list(input().split())
    for i in l:
        if i != "-":
            if i in work:
                work[i] += 4
            else:
                work[i] = 4
    l = list(input().split())
    for i in l:
        if i != "-":
            if i in work:
                work[i] += 10
            else:
                work[i] = 10

if work:
    v = work.values()
    if max(v) - min(v) <= 12:
        print("Yes")
    else:
        print("No")
else:
    print("Yes")
