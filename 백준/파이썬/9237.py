n = int(input())
s = list(map(int, input().split()))
s.sort(reverse=1)
for i in range(2, n + 2):
    s[i - 2] += i
print(max(s))
