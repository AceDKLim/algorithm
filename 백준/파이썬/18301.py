import math as m

n1, n2, n12 = map(int, input().split())
print(m.floor((n1 + 1) * (n2 + 1) / (n12 + 1) - 1))
