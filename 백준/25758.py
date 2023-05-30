n = int(input())
one = tuple(input().split())
two = set()
for i in range(n):
    for j in range(i + 1, n):
        two.add(max(one[i][0], one[j][1]))
        two.add(max(one[i][1], one[j][0]))
print(*sorted(list(two)))
