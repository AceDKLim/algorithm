n = int(input())
house = []
for _ in range(n):
    house.append(list(input()))


d_x = [-1, 1, 0, 0]
d_y = [0, 0, -1, 1]


def dfs(house, x, y):
    if x < 0 or x >= n or y < 0 or y >= n:
        return 0
    if house[x][y] == "0":
        return 0
    house[x][y] = "0"
    global c
    c += 1
    for i in range(4):
        dfs(house, x + d_x[i], y + d_y[i])
    return c


cnt = 0
result = []
for i in range(n):
    for j in range(n):
        c = 0
        r = dfs(house, i, j)
        if r:
            cnt += 1
            result.append(r)
result.sort()
print(cnt)
print(*result, sep="\n")
