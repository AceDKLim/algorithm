da = list(map(int, input().split()))

if da == sorted(da):
    print("ascending")
elif da == sorted(da)[::-1]:
    print("descending")
else:
    print("mixed")
