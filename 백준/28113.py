n, a, b = map(int, input().split())

if n > b:
    print("Bus")
elif a < b:
    print("Bus")
elif a == b:
    print("Anything")
else:
    print("Subway")
