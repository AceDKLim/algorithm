from sys import stdin

input = stdin.readline
n = int(input())

result = 0
grade = sorted(int(input()) for _ in range(n))
print(grade)
print(result)
