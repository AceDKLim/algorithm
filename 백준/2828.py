n, m = map(int, input().split())
j = int(input())
a = [i for i in range(1, m + 1)]
move = 0
for _ in range(j):
    l = int(input())
    while l not in a:
        if a[0] > l:
            for i in range(m):
                a[i] -= 1
            move += 1
        else:
            for i in range(m):
                a[i] += 1
            move += 1
print(move)
