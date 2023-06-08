import math

s = input()
t = input()

l_s = len(s)
l_t = len(t)

l = math.lcm(l_s, l_t)
if s * (l // l_s) == t * (l // l_t):
    print(1)
else:
    print(0)
