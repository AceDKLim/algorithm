def g_to_p(g):
    g_dic = {"A": 4, "B": 3, "C": 2, "D": 1, "F": 0}

    if g[0] in g_dic:
        if g[-1] == "+":
            return g_dic[g[0]] + 0.5
        else:
            return g_dic[g[0]]
    else:
        return -1


g_sum = 0
p_sum = 0
for _ in range(20):
    a, b, c = map(str, input().split())
    if g_to_p(c) >= 0:
        g_sum += int(b[0]) * g_to_p(c)
        p_sum += int(b[0])
if g_sum == 0:
    print(0)
else:
    print(g_sum / p_sum)
