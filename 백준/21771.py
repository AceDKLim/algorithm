r, c = map(int, input().split())

rg, cg, rp, cp = map(int, input().split())
g_a = []
p_a = []
result = 0
for i in range(r):
    n = input()
    if "G" in n:
        for j in range(c):
            if n[j] == "G":
                g_a.append((i, j))
    if "P" in n:
        for j in range(c):
            if n[j] == "P":
                p_a.append((i, j))

if len(g_a) == rg * cg and len(p_a) < rp * cp:
    print(1)
else:
    print(0)
