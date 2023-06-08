t = input()

happy = 0
sad = 0

for i in range(len(t) - 1):
    if t[i] == "-" and t[i + 1] == "(":
        sad += 1
    if t[i] == "-" and t[i + 1] == ")":
        happy += 1

if happy == 0 and sad == 0:
    print("none")
elif happy == sad:
    print("unsure")
elif happy > sad:
    print("happy")
else:
    print("sad")
