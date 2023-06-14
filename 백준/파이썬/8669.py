from sys import stdin

input = stdin.readline
n = int(input())
tree = {}
for _ in range(n):
    g, r = map(int, input().split())
    tree[r] = g
print(len(tree))
