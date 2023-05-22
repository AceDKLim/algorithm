import math as m

n = int(input())
a = list(map(int, input().split()))

l = m.lcm(*a)
if l == max(a):
    l *= min(a)
print(l)
