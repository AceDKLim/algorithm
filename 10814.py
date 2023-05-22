n = int(input())
people = []
for _ in range(n):
    people.append(list(map(str, input().split())))

people = sorted(people, key=lambda x: (int(x[0])))
for i in range(n):
    print(*people[i])
