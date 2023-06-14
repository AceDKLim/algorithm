a, b = map(int, input().split())
n = int(input())

t = abs(a - b)
for i in range(n):
    c = int(input())
    t = abs(b - c) + 1 if abs(b - c) + 1 <= t else t
print(t)
