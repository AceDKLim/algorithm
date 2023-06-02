def dfs(n, x, y):
    n += nums[x][y]
    if len(n) == 6:
        if n in result:
            return
        else:
            result.append(n)
            return
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= 5 or ny >= 5:
            continue
        dfs(n, nx, ny)
    return


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

nums = list(input().split() for _ in range(5))
result = []
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

for i in range(5):
    for j in range(5):
        dfs("", i, j)
print(len(result))
