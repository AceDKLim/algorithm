s1 = list(input())
s2 = list(input())
l1 = len(s1)
l2 = len(s2)
s = [1 for _ in range(l2)]

for i in range(l1):
    for j in range(l2):
        if s2[j] == s1[i]:
            s[j] = max(s[j], i)
print(s)
