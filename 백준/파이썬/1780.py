n = int(input())
paper = []
for _ in range(n):
    paper.append(input().split())

cnt = [0, 0, 0]


def cut_p(sr, sc, size):
    color = paper[sr][sc]
    for i in range(sr, sr + size):
        if size == 1:
            break
        for j in range(sc, sc + size):
            if paper[i][j] != color:
                size //= 3
                cut_p(sr, sc, size)
                cut_p(sr, sc + size, size)
                cut_p(sr, sc + size * 2, size)
                cut_p(sr + size, sc, size)
                cut_p(sr + size, sc + size, size)
                cut_p(sr + size, sc + size * 2, size)
                cut_p(sr + size * 2, sc, size)
                cut_p(sr + size * 2, sc + size, size)
                cut_p(sr + size * 2, sc + size * 2, size)
                return
    if color == "-1":
        cnt[0] += 1
    elif color == "0":
        cnt[1] += 1
    elif color == "1":
        cnt[2] += 1
    return


cut_p(0, 0, n)
print(*cnt, sep="\n")
