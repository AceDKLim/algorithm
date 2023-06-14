n, h = map(int, input().split())

cow = list(int(input()) for _ in range(n))
pick = [0] * n
result = []
s = 0


def dfs(x, s):
    s += cow[x]
    result.append(x)
    pick[x] = 1
    if s >= h:
        print(result)
        print(s)
        return s
    for nx in range(n):
        if pick[nx] == 0:
            print(dfs(nx, s))
            pick[x] = 0
    return 0


# print(dfs(0))
dfs(0, 0)
