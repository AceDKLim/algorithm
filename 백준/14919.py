n = int(input())

l = [100000 for _ in range(n + 1)]
l[0] = 0
for i in range(2, n + 1):
    l[i] = min(l[i], l[i - 2] + 1)

# for j in range(1,n+1):


print(l)
