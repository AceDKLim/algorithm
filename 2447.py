def s(n):
    l = []
    if n == 1:
        return "*"
    else:
        for i in s(n // 3):
            l.append(i * 3)
        for i in s(n // 3):
            l.append(i + " " * (n // 3) + i)
        for i in s(n // 3):
            l.append(i * 3)
        return l


n = int(input())

for i in s(n):
    print(i)
