n = int(input())
cnt = 0
for _ in range(n):
    gift = input()
    n = gift[2:]
    if int(n) <= 90:
        cnt += 1
print(cnt)
