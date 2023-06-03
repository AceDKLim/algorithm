def post_order(node):
    if tree[node][0] in tree:
        post_order(tree[node][0])
    elif tree[node][0] != None:
        print(tree[node][0])
    if tree[node][1] in tree:
        post_order(tree[node][1])
    elif tree[node][1] != None:
        print(tree[node][1])
    print(node)


tree = {}
root = []
n = int(input())
s = n
while 1:
    try:
        m = int(input())
        if n > m:
            tree[n] = [m]
            root.append(n)
        else:
            l = root.pop()
            if l < m:
                tree[l].append(m)
            else:
                tree[l].append(None)
                if n > m:
                    tree[n] = [None, m]
                else:
                    tree[n] = [m, None]
        n = m
    except:
        break


post_order(s)
