n, k = map(int, input().split())
num = list(map(int, input().split(",")))

for _ in range(k):
    l = len(num)
    r = [0 for _ in range(l - 1)]
    for i in range(l - 1):
        r[i] = num[i + 1] - num[i]
    num = r

print(*num, sep=",")
