x, y, w, h = map(int, input().split())

r_x = w - x
r_y = h - y

print(min(x, y, r_x, r_y))
