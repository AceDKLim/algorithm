from sys import stdin

input = stdin.readline

tree = {}

while 1:
    try:
        t = input().rstrip()
        if t in tree:
            tree[t] += 1
        else:
            tree[t] = 1
    except:
        break

t = sorted(tree)
s = sum(tree.values())

for i in t:
    print(f"{i} {(tree[i] / s) * 100:.4f}")
