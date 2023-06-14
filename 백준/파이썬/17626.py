n = int(input())
cnt = 0
while n > 0:
    n -= int(n**0.5) ** 2
    cnt += 1
    print(n)
print(cnt)
