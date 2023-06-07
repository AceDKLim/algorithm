f = [1, 1]
n = int(input())
for i in range(2, n + 1):
    f.append(f[i - 2] + f[i - 1] + 1)


print(f[n] % 1000000007)
