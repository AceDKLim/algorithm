n, k = map(int, input().split())

things = []
#무게, 가치순서
value = [[i,0]for i in range()]
for _ in range(n):
    things.append(tuple(map(int, input().split())))

for i in range(n):
    h,v=things[i]
    if value[i][0]+
