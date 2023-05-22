import math as m

a1, b1 = map(int, input().split())
a2, b2 = map(int, input().split())

molecule = (a1 * m.lcm(b1, b2) // b1) + (a2 * m.lcm(b1, b2) // b2)
denominator = m.lcm(b1, b2)

while m.gcd(molecule, denominator) != 1.0:
    g = m.gcd(molecule, denominator)
    molecule //= g
    denominator //= g

print(molecule, denominator)
