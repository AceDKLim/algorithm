import math as m

t = int(input())

for _ in range(t):
    a, b = map(int, input().split())
    print(m.lcm(a, b))
