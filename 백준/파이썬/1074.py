def z(x, y, n):
    global cnt
    if n == 2:
        for i in range(x, x + 2):
            for j in range(y, y + 2):
                z_arr[i][j] = cnt
                print(i, j, cnt)
                if i == r and j == c:
                    break
                cnt += 1
    else:
        for i in range(0, n, n // 2):
            for j in range(0, n, n // 2):
                z(x + i, y + j, n // 2)


n, r, c = map(int, input().split())

cnt = 0
z_arr = [[0 for _ in range(2**n)] for _ in range(2**n)]
z(0, 0, 2**n)

print(z_arr[r][c])
