def pascal(n, m):
    if n == m or m == 1:
        pas[n][m] = 1
        return 1
    a = pas[n - 1][m - 1]
    b = pas[n - 1][m]
    if a == -1:
        a = pascal(n - 1, m - 1)
    if b == -1:
        b = pascal(n - 1, m)
    pas[n][m] = a + b
    return a + b


n, m = map(int, input().split())
pas = [[-1 for _ in range(n + 1)] for _ in range(n + 1)]
print(pascal(n, m))
