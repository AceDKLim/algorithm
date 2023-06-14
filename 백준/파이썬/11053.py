n = int(input())
s = list(map(int, input().split()))

l = [1 for _ in range(n)]
for i in range(n):
    for j in range(i):
        if s[i] > s[j]:
            l[i] = max(l[i], l[j] + 1)
print(max(l))
