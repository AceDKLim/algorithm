from sys import stdin
from collections import deque
import decimal

context = decimal.getcontext()
context.rounding = decimal.ROUND_HALF_UP
input = stdin.readline
n = int(input())
l = deque(sorted(int(input()) for _ in range(n)))
s = int(round(decimal.Decimal(n * 0.15), 0))
if n == 0:
    print(0)
else:
    for _ in range(s):
        l.popleft()
        l.pop()
    print(round(decimal.Decimal(sum(l) / len(l)), 0))
