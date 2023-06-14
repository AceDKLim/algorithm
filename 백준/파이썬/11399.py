n = int(input())
p = list(map(int, input().split()))
p.sort()

sum = 0
s = 0
for i in p:
    s += i
    sum += s
print(sum)
