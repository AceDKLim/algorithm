from collections import deque

n = list("1234567890")
s = input()
k = input()

for i in s:
    if i in n:
        s = s.replace(i, "")

result = 0
for i in range(len(s)):
    if s[i] == k[0] and i + len(k) <= len(s):
        cnt = 1
        for j in range(1, len(k)):
            if k[j] == s[i + j]:
                cnt += 1
        if cnt == len(k):
            result = 1
            break

print(result)
