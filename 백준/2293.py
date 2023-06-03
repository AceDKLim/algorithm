n, m = map(int, input().split())

cnt = 0
money = []
for _ in range(n):
    num = int(input())
    if num <= m:
        cnt += 1
        money.append(num)

money.sort()
