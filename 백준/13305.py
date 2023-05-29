n = int(input())


distance = list(map(int, input().split()))
oil = list(map(int, input().split()))
result = oil[0] * distance[0]

for i in range(1,n-1):
    for j in range(i,n-1)