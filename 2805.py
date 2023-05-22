n, m = map(int, input().split())
tree = list(map(int, input().split()))

left = 0
right = max(tree)

while left <= right:
    mid = (left + right) // 2
    height = 0

    for i in tree:
        if i > mid:
            height += i - mid
    if height >= m:
        left = mid + 1
    else:
        right = mid - 1
print(right)
