n = int(input())
s = list(map(int, input().split()))

result = 0
t = s.pop()
while s:
    n = s.pop()
    if n < t:
        result = max(result, t - n)
    else:
        t = n
print(result)
