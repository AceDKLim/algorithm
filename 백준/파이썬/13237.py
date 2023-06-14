n = int(input())
height = [-1] * (n + 1)
node = [0] + [int(input()) for _ in range(n)]


# 원래 인덱스, 탐색위해 변형 인덱스, 루트와의 거리 측정
def find_parent(i, j, n):
    if node[j] == -1:
        height[i] = n
    else:
        find_parent(i, node[j], n + 1)


for i in range(1, n + 1):
    find_parent(i, i, 0)
print(*height[1:], sep="\n")
