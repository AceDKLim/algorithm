n, k = map(int, input().split())
road = [0]

for i in range(1 - n, k - n + 2):
    road.append(abs(i))

for i in range(2, k + 2):
    road[i] = min(road[i], road[i - 1] + 1)
    if i % 2 == 0:
        road[i] = min(road[i], road[i // 2] + 1)
    road[i - 1] = min(road[i - 1], road[i] + 1)


print(road[k])
