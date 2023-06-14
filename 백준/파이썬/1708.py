import math as m


# 세 점 상대 위치 결정
def direction(a, b, c):
    dxab = b[0] - a[0]
    dyab = b[1] - a[1]
    dxac = c[0] - a[0]
    dyac = c[1] - a[1]
    # ab기울기, ac기울기
    lab = dxab * dyac
    lac = dyab * dxac
    # ac기울기 더 크면 시계 반대 방향 -> 1반환
    if lab < lac:
        return 1
    # ab기울기 더 크면 시게 방향 -> -1반환
    if lab > lac:
        return -1
    else:
        return 0


# a,b의 각 반환
def degree(a, b):
    x1, y1 = a
    x2, y2 = b
    x = x2 - x1
    y = y2 - y1
    if x == 0:
        if a == b:
            return 0
        else:
            return 90
    return 90 - m.atan2(x, y) * 180 / m.pi


n = int(input())

l = []
x_cnt = []
y_cnt = []
for i in range(n):
    x, y = map(int, input().split())
    l.append((x, y))

t = min(l, key=lambda y: y[1])
l.sort(key=lambda n: (degree(t, n), n[1], n[0]))
result = []
result.append(l[0])
result.append(l[1])
i = 2
while i < len(l):
    b = result.pop()
    a = result.pop()
    c = l[i]
    # 시계 방향이면 result에 a,b,c 3개 다 넣고 넘어감
    # 시계 반대 방향이면 b 버리고 다시 비교
    if direction(a, b, c) == -1:
        result.append(a)
        result.append(b)
        result.append(c)
        i += 1
    elif direction(a, b, c) == 1:
        result.append(a)
    else:
        result.append(a)
        result.append(c)
        i += 1

answer = 0
for i in range(-2, len(result) - 2):
    if direction(result[i], result[i + 1], result[i + 2]) == 0:
        answer -= 1
print(len(result) + answer)
