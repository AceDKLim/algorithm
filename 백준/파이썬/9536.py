t = int(input())
for _ in range(t):
    recode = input().split()
    sound = []
    while 1:
        q = input()
        if q == "what does the fox say?":
            break
        s = q.split()[2]
        sound.append(s)
    for i in recode:
        if i not in sound:
            print(i, end=" ")
    print()
