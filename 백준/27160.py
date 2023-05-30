card = {"STRAWBERRY": 0, "BANANA": 0, "LIME": 0, "PLUM": 0}

n = int(input())
for _ in range(n):
    a, b = input().split()
    card[a] += int(b)
if 5 in card.values():
    print("YES")
else:
    print("NO")
