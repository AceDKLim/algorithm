n = int(input())

for _ in range(n):
    a, b, c, d = map(int, input().split())
    if a * b < c * d:
        print("TelecomParisTech")
    else:
        print("Eurecom")
