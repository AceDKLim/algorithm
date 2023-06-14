def fact(n):
    f = 1
    for i in range(1, n + 1):
        f *= i
    return f


n, k = map(int, input().split())
print(fact(n) // fact(k) // fact(n - k))
