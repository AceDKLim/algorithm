n = int(input())

member = set()
count = 0
for _ in range(n):
    talk = input()
    if talk == "ENTER":
        count += len(member)
        member.clear()
    else:
        member.add(talk)
count += len(member)
print(count)
