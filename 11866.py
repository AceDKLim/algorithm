n, k = map(int, input().split())

people = [i for i in range(1, n + 1)]

count = 0
i = k - 1
c = 0
print("<", end="")
while count < n - 1:
    print(people[i], end=", ")
    people.pop(i)
    while c < k - 1:
        i += 1
        if i > len(people) - 1:
            i -= len(people)
        c += 1
    c = 0
    count += 1
print(f"{people[0]}>")
