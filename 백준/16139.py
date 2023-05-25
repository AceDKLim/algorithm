s = input()
n = int(input())
r = [0]
a, b, c = map(str, input().split())
num = 0
for i in s:
    if i == a:
        num += 1
    r.append(num)
print(r[int(c)] - r[int(b)])
for _ in range(n - 1):
    a, b, c = map(str, input().split())
    print(r[int(c)] - r[int(b)])
print(r)
