from sys import stdin

input = stdin.readline

n, c = map(int, input().split())
house = tuple(sorted(int(input()) for _ in range(n)))
start, end = 1, house[-1] - house[0]

while start < end:
    mid = (start + end) // 2
    s = house[0]
    cnt = 1
    for i in range(n):
        if house[i] - s >= mid:
            cnt += 1
            s = house[i]
    if cnt < c:
        end = mid
    else:
        start = mid + 1
        result = mid

if c == 2:
    result = house[-1] - house[0]

print(result)
