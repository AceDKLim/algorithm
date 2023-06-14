import math

n, m = map(int, input().split(":"))
l = math.gcd(n, m)

print(f"{n//l}:{m//l}")
