n = int(input())

for i in range(1, n + 1):
    tri = list(map(int, input().split()))
    tri.sort()
    print(f"Scenario #{i}:")
    if tri[2] == (tri[0] ** 2 + tri[1] ** 2) ** 0.5:
        print("yes")
    else:
        print("no")
    print()
