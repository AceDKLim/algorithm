# 현재 a학기 전공b, 교양 c-b이수
# 8-a학기 남음, 전공 66-b점 남음 음수면 0, 교양 남은대로 긁자!

a, b, c = map(int, input().split())

open_class = list(tuple(map(int, input().split())) for _ in range(10))

for i in range(8 - a):
    x, y = open_class[i]
    z = min(x, 6)
    r = min(6 - z, y)
    b += z * 3
    c += z * 3
    c += r * 3

if b >= 66 and c >= 130:
    print("Nice")
else:
    print("Nae ga wae")
