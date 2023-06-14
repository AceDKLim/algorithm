n = int(input())

for _ in range(n):
    a, b = input().split()
    c = 0
    for i in a:
        if a.count(i) != b.count(i):
            c += 1
            break
    if c:
        print(f"{a} & {b} are NOT anagrams.")
    else:
        print(f"{a} & {b} are anagrams.")
