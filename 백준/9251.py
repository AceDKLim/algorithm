s1 = input()
s2 = input()

for i in s1:
    if i not in s2:
        s1.replace(i, "")
for i in s2:
    if i not in s1:
        s2.replace(i, "")
print(s1)
print(s2)
