from sys import stdin

input = stdin.readline

n = int(input())
triangle = sorted(int(input()) for _ in range(n))


while len(triangle) > 3 and triangle[-3] + triangle[-2] <= triangle[-1]:
    triangle.pop()

if triangle[-3] + triangle[-2] > triangle[-1]:
    print(triangle[-3] + triangle[-2] + triangle[-1])
else:
    print(-1)
