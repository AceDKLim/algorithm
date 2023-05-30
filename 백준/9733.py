work = {}


while 1:
    try:
        did = input().split()
        for i in did:
            if i in work:
                work[i] += 1
            else:
                work[i] = 1
    except:
        break

p = ["Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"]
k = work.keys()
v = work.values()
s = sum(v)
for i in p:
    if i not in k:
        print(f"{i} 0 0.00")
    else:
        print(f"{i} {work[i]} {1/(s/work[i]):0.2f}")
print(f"Total {s} 1.00")
