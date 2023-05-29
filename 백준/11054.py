n = int(input())
num = list(map(int, input().split()))
l1 = [1 for _ in range(n)]
l2 = [1 for _ in range(n)]
for i in range(n):
    for j in range(i):
        if num[i] > num[j]:
            l1[i] = max(l1[i], l1[j] + 1)


num.reverse()
for i in range(n):
    for j in range(i):
        if num[i] > num[j]:
            l2[i] = max(l2[i], l2[j] + 1)
l2.reverse()

l = []
for i in range(n):
    l.append(l1[i] + l2[i])
print(max(l) - 1)
