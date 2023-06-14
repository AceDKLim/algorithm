n = int(input())
house = []
for i in range(n):
    l = list(map(int, input().split()))
    house.append(l)

c = []
num = 0
for i in range(6 * (n - 1)):
    if i % (2 * (n - 1)) == 0:
        num += 1
    c.append([num])


for i in c:
    if i[-1] != j:
        i.append(j)
print(c)
