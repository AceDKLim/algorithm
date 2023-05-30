n = int(input())
four = []
cheese = list(input().split())

for i in cheese:
    if len(i) >= 6 and i[-6:] == "Cheese" and i not in four:
        four.append(i)
if len(four) >= 4:
    print("yummy")
else:
    print("sad")
