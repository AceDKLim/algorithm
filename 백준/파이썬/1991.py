def pre_order(node):
    print(node, end="")
    if tree[node][0] != ".":
        pre_order(tree[node][0])
    if tree[node][1] != ".":
        pre_order(tree[node][1])


def in_order(node):
    if tree[node][0] != ".":
        in_order(tree[node][0])
    print(node, end="")
    if tree[node][1] != ".":
        in_order(tree[node][1])


def post_order(node):
    if tree[node][0] != ".":
        post_order(tree[node][0])
    if tree[node][1] != ".":
        post_order(tree[node][1])
    print(node, end="")


n = int(input())
tree = {}
for i in range(n):
    v, l, r = input().split()
    tree[v] = (l, r)
pre_order("A")
print()
in_order("A")
print()
post_order("A")
