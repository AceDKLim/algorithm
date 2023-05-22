import sys

input = sys.stdin.readline
t = int(input())
triangle = []
for _ in range(t):
    triangle.append(tuple(map(int, input().rstrip().split())))
triangle = tuple(triangle)

sum_tri = [[triangle[0][0]]]

n = 0
for i in range(t - 1):
    sums = []
    for j in range(i + 1):
        print(i, j)
        s = sum_tri[i][j]
        sums.append([s + triangle[i + 1][j], s + triangle[i + 1][j + 1]])
        print(sum_tri)
    sum_tri.append(sums)
