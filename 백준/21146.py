result = 0
n, k = map(int, input().split())

for _ in range(k):
    result += int(input())

max_result = (result + (3 * (n - k))) / n
min_result = (result + (-3 * (n - k))) / n

print(min_result, max_result)
