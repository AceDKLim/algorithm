a, b = input().split()

for i in a:
    if i in b:
        ai = a.index(i)
        bi = b.index(i)
        break

for i in range(len(b)):
    if i == bi:
        print(a)
    else:
        for j in range(len(a)):
            if j == ai:
                print(b[i], end="")
            else:
                print(".", end="")
        print()
