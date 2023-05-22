k, n = map(int, input().split())
l = []
for _ in range(k):
    l.append(int(input()))

left = 1
right = max(l)

while left <= right:
    lan = (left + right) // 2
    s = 0

    for i in l:
        s += i // lan

    if s < n:
        right = lan - 1
    else:
        left = lan + 1

print(right)
