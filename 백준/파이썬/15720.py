b, c, d = map(int, input().split())

buger = sorted(list(map(int, input().split())))
side = sorted(list(map(int, input().split())))
dessert = sorted(list(map(int, input().split())))

s = 0
ds = 0

for _ in range(max(b, c, d)):
    m = []
    if buger:
        m.append(buger.pop())
    if side:
        m.append(side.pop())
    if dessert:
        m.append(dessert.pop())
    if len(m) == 3:
        ds += sum(m) * 0.9
        s += sum(m)
    else:
        ds += sum(m)
        s += sum(m)
print(s)
print(int(ds))
