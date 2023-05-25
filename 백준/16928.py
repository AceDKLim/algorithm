n, m = map(int, input().split())
ladder = []
snake = []
for _ in range(n):
    ladder.append(tuple(map(int, input().split())))
for _ in range(m):
    snake.append(int(input().split()[0]))

result = int(1e9)
for i in range(n):
    now = 1
    cnt1 = 0
    while now < ladder[i][0]:
        num = 6
        while now + num in snake:
            num -= 1
        now += num
        cnt1 += 1
    now = ladder[i][1]
    cnt2 = 0
    while now < 100:
        num = 6
        while now + num in snake:
            num -= 1
        now += num
        cnt2 += 1
    if cnt1 + cnt2 < result:
        result = cnt1 + cnt2
print(result)
