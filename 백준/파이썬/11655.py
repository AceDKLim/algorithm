def upperROT13(n):
    n -= 13
    if n < ord("A"):
        n += ord("Z") - ord("A") + 1
    return chr(n)


def lowerROT13(n):
    n -= 13
    if n < ord("a"):
        n += ord("z") - ord("a") + 1
    return chr(n)


c = list(input())

for i in range(len(c)):
    n = ord(c[i])
    if n >= ord("a") and n <= ord("z"):
        c[i] = lowerROT13(n)
    elif n >= ord("A") and n <= ord("Z"):
        c[i] = upperROT13(n)
print(*c, sep="")
