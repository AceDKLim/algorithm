a, b, c = map(int, input().split())


def square(num, n):
    if n == 1:
        return num % c
    sq = square(num, n // 2)
    if n % 2 == 0:
        return sq * sq % c
    else:
        return num * sq * sq % c


print(square(a, b))
