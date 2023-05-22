n = int(input())
house = []
for i in range(n):
    l = list(map(int, input().split()))
    house.append(l)

min_cost = 3001
for i in range(n):
    for j in range(n):
        for k in range(n):
            if i != j and j != k:
                print(house[i][0] + house[j][1] + house[k][2])
                min_cost = min(min_cost, house[i][0] + house[j][1] + house[k][2])

print(min_cost)
