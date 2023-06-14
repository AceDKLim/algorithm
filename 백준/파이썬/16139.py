s = input()
n = int(input())

result = []
a, b, c = input().split()

cnt = 0
for i in s:
    if i == a:
        cnt += 1
    result.append(cnt)

print(result)
print(result[int(c)] - result[max(0, int(b) - 1)])


for _ in range(n - 1):
    a, b, c = input().split()
    print(result[int(c)] - result[max(0, int(b) - 1)])
