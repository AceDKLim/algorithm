a = input()
l = [i for i in a]
n = len(l)
s = set()
for i in range(n):
    st = ""
    for j in range(i, n):
        st += l[j]
        s.add(st)
print(len(s))
