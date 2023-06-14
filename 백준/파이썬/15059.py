a = list(map(int, input().split()))
r = list(map(int, input().split()))
result = 0
for i in range(3):
    n = r[i] - a[i]
    if n > 0:
        result += n
print(result)
