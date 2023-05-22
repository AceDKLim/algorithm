l = [0] * 26
n = input()
for i in n:
    l[ord(i) - ord("a")] += 1
print(*l)
