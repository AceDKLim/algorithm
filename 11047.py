n, k = map(int, input().split())
m = []
for _ in range(n):
    i = int(input())
    if i <= k:
        m.append(i)

cnt = 0
while k > 0:
    if k >= m[-1]:
        p = k // m[-1]
        k -= p * m[-1]
        cnt += p
    else:
        m.pop()
print(cnt)
