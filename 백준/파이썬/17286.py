def dis(coord1, coord2):
    x1, y1 = coord1
    x2, y2 = coord2
    return ((y1 - y2) ** 2 + (x1 - x2) ** 2) ** 0.5


coords = list(tuple(map(int, input().split())) for _ in range(4))

distance = []
for i in range(1, 4):
    for j in range(i + 1, 4):
        distance.append(dis(coords[i], coords[j]))
distance.sort()
result = 1e9
s = sum(distance)
for i in range(1, 4):
    d = dis(coords[0], coords[i])
    for j in range(1, 3):
        result = min(result, d + s - distance[i - j])

print(int(result))
