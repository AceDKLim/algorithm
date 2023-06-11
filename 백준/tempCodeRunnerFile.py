s1 = input()
s2 = input()

l1 = len(s1)
l2 = len(s2)

result = [0 for _ in range(l2)]


for i in range(l1):
    cnt = 1
    for j in range(l2):
        if result[j] >= cnt:
            cnt = result[j] + 1
        if s1[i] == s2[j]:
            result[j] = cnt

print(max(result))
