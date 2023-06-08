t = int(input())

for i in range(1, t + 1):
    n = int(input())
    h = list(map(int, input().split()))
    p = 0
    result = 0
    for j in h:
        if j <= p:
            result += 1
        p = j
    print(f"Case #{i}: {result}")
