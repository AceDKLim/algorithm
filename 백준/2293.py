n, m = map(int, input().split())

money = [0] * (m + 1)
for _ in range(n):
    num = int(input())
    for i in range(num):
        if money[i] == 1:
            for j in range(i + num, m + 1):
                money[j] += 1

print(money)
