n = int(input())

for _ in range(n):
    people = list(map(int, input().split()))
    t = people[0]
    l = {}
    for i in people[1:]:
        if i in l:
            l[i] += 1
        else:
            l[i] = 1
    l = sorted(l.items(), key=lambda x: -x[1])
    if l[0][1] * 2 > t:
        print(l[0][0])
    else:
        print("SYJKGW")
