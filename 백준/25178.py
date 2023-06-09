n = int(input())

s1 = input()
s2 = input()

check = 1
# for i in range(n):
#     a = s1[i]
#     b = s2[i]

#     if s1.count(a) != s2.count(a):
#         check = 0
#         break
#     if s1.count(b) != s2.count(b):
#         check = 0
#         break

if check == 1:
    if s1[0] != s2[0] or s1[-1] != s2[-1]:
        check = 0

if check == 1:
    for i in ["a", "e", "i", "o", "u"]:
        if s1.count(i) != s2.count(i):
            check = 0
            break
        s1 = s1.replace(i, "")
        s2 = s2.replace(i, "")
    if s1 != s2:
        check = 0
if check == 1:
    print("YES")
else:
    print("NO")
