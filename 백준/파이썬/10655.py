n = int(input())

course = list(tuple(map(int, input().split())) for _ in range(n))
result = []

for i in range(1,n-1):
    course[i-1][]