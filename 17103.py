import math as m
from sys import stdin

num = 1000000
primes = [True for i in range(num + 1)]

for i in range(2, int(num**0.5) + 1):
    if primes[i] == True:
        j = 2
        while i * j <= num:
            primes[i * j] = False
            j += 1

n = int(stdin.readline())
for _ in range(n):
    num = int(stdin.readline())
    cnt = 0
    for i in range(2, num // 2 + 1):
        if primes[i] == True and primes[num - i] == True:
            cnt += 1
    print(cnt)
