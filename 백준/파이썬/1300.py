n = int(input())
k = int(input())

check = [[] for _ in range(n)]
cnt = 0
for i in range(n):
    for j in range(1, i + 2):
        if (i + 1) % j == 0:
            cnt += 1
            check[i].append(cnt)

for i in range(n-1,-1,-1):
    
    
