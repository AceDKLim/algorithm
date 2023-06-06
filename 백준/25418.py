a, k = map(int, input().split())

result = 0

while a <= abs(k - a):
    if k % 2 == 1:
        k -= 1
        result += 1
    else:
        k //= 2
        result += 1

result += k - a
print(result)
