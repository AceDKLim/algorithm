n = int(input())

tower = list(map(int, input().split()))

result = 1
for i in range(1, n):
    if tower[i - 1] < tower[i]:
        result += 1
print(result)
