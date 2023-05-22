n, m, b = map(int, input().split())

land = []
land_count = []
for _ in range(n):
    land.append(map(int, input().split()))

for i in range(n):
    land_count.append(sum(land[i]))

if land_count.count(max(land_count))<land_count.count(min(land_count)):
