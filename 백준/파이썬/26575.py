n = int(input())
for _ in range(n):
    a, b, c = map(float, input().split())
    print(f"${a * b * c:3.2f}")
