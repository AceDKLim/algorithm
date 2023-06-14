n = int(input())

d_people = set()
for _ in range(n):
    a, b = map(str, input().split())
    if a == "ChongChong" or b == "ChongChong":
        d_people.add(a)
        d_people.add(b)
    elif a in d_people or b in d_people:
        d_people.add(a)
        d_people.add(b)
print(len(d_people))
