bridge = [[0 for _ in range(30)] for _ in range(30)]

for i in range(30):
    bridge[1][i] = i

for i in range(2, 30):
    for j in range(2, 30):
        bridge[i][j] = bridge[i][j - 1] + bridge[i - 1][j - 1]

t = int(input())

for _ in range(t):
    n, m = map(int, input().split())
    print(bridge[n][m])
