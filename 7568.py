n = int(input())
people = []
for i in range(n):
    people.append(list(map(int, input().split())))
    people[i].append(i)
people.sort(reverse=1)

g = 0
for i in range(n - 1):
    if people[i][0] > people[i + 1][0] and people[i][1] > people[i + 1][1]:
        g += 1
    people[i + 1].append(g)
if people[-2][0] > people[-1][0] and people[-2][1] > people[-1][1]:
    people[-1].append(g + c_g)
else:
    people[-1].append(g)

print(people)
