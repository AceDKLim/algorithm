n = int(input())

for _ in range(n):
    s = sum(i for i in range(65, 91))
    t = set(input())
    for i in t:
        s -= ord(i)
    print(s)
