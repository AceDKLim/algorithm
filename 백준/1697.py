n, k = map(int, input().split())
road = [0]

for i in range(1 - n, k - n + 1):
    road.append(abs(i))

for i in range(1, k // 2 + 1):
    if road[i] + 1 < road[i * 2]:
        road[i * 2] = road[i] + 1
        for j in range(i * 2, min(k + 1, i * 3)):
            if road[i - 1] > road[i] + 1:
                road[i - 1] = road[i] + 1
            elif road[i - 1] + 1 < road[i]:
                road[i] = road[i - 1] + 1


print(road)
