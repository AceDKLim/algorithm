n = list(input())
m = list(input())

cnt = 0
while n != m:
    for i in range(len(n)):
        if n.count(n[i]) > m.count(n[i]):
            n.pop(i)
            cnt += 1
            break
    for i in range(len(m)):
        if n.count(m[i]) < m.count(m[i]):
            m.pop(i)
            cnt += 1
            break
    n.sort()
    m.sort()
print(cnt)
