n = int(input())
picture = []
for _ in range(n):
    picture.append(list(input()))


def quad_tree(p):
    zc = 0
    oc = 0
    for i in p:
        zc += i.count("0")
        oc += i.count("1")
    if zc == 0:
        return "1"
    elif oc == 0:
        return "0"
    else:
        l1 = []
        l2 = []
        l3 = []
        l4 = []
        result = "("
        h_len = len(p) // 2
        for i in range(h_len):
            l1.append(p[i][:h_len])
            l2.append(p[i][h_len:])
        for i in range(h_len, len(p)):
            l3.append(p[i][:h_len])
            l4.append(p[i][h_len:])
        result += quad_tree(l1)
        result += quad_tree(l2)
        result += quad_tree(l3)
        result += quad_tree(l4)
        result += ")"
        return result


print(quad_tree(picture))
