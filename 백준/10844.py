def stair(n, m):
    if m == 2:
        if n == 0 or n == 9:
            return 1
        else:
            return 2
    if s[n][m] != INF:
        return s[n][m]
    if n == 0:
        s[n][m] = stair(n + 1, m - 1) % 1000000000
    elif n == 9:
        s[n][m] = stair(n - 1, m - 1) % 1000000000
    else:
        s[n][m] = stair(n - 1, m - 1) % 1000000000 + stair(n + 1, m - 1) % 1000000000
    return s[n][m]


m = int(input())
if m == 1:
    print(9)
else:
    result = 0
    INF = 0e9
    s = [[INF for _ in range(m + 1)] for _ in range(10)]
    for i in range(1, 10):
        result += stair(i, m) % 1000000000
    print(result % 1000000000)
