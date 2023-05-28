# n->가로길이 m->세로길이 k->자를 크기
n, m, k = map(int, input().split())
chess = [[0 for _ in range(m + 1)]]
for i in range(n):
    # 단어 받아서 변환
    c = input()
    num = [0]
    for j in c:
        if j == "W":
            num.append(0)
        else:
            num.append(1)

    # row 합치기
    for j in range(1, m + 1):
        num[j] = num[j - 1] + num[j]

    for j in range(1, m + 1):
        num[j] = num[j] + chess[i][j]

    chess.append(num)

result = 20000
for i in range(1, n - k + 2):
    for j in range(1, m - k + 2):
        t = (
            chess[i + k - 1][j + k - 1]
            - chess[i + k - 1][j - 1]
            - chess[i - 1][j + k - 1]
            + chess[i - 1][j - 1]
        )
        print(
            chess[i + k - 1][j + k - 1],
            chess[i + k - 1][j - 1],
            chess[i - 1][j + k - 1],
            chess[i - 1][j - 1],
        )
        print(t, k**2 - t)
        result = min(result, t, k**2 - t)
print(result)
