n = int(input())


distance = list(map(int, input().split()))
oil = list(map(int, input().split()))
result = 0

while oil:
    m = oil.index(min(oil))
    result += sum(distance[m:]) * oil[m]
    distance = distance[:m]
    oil = oil[:m]
print(result)
