n = list(input())

for i in range(len(n)):
    c = ord(n[i]) - 3
    if c < ord("A"):
        c += ord("Z") - ord("A") + 1
    n[i] = chr(c)

print(*n, sep="")
