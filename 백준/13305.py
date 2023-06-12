n = int(input())
distance = list(map(int, input().split()))
oil = list(map(int, input().split()))
n -= 1

result = 0
m = oil[0]
for i in range(n):
    d = oil[i]
    if m > d:
        m = d
    result += m * distance[i]

print(result)
