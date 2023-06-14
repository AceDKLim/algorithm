n = int(input())

for _ in range(n):
    result = "YES"
    a, b = input().split()
    for i in b:
        if i not in a:
            result = "NO"
            break
    for i in a:
        if i not in b:
            result = "NO"
            break
    print(result)
