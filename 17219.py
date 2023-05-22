n, m = map(int, input().split())

pw = {}
for _ in range(n):
    site, password = map(str, input().split())
    pw[site] = password
for _ in range(m):
    s = input()
    print(pw[s])
