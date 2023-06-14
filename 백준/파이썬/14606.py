n = int(input())


def half(n):
    if n == 1:
        return 0
    h = n // 2
    result = h * (n - h)
    return half(h) + half(n - h) + result


print(half(n))
