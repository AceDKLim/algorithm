# num = [[0, i, -1] for i in range(n)]

# for i in range(n):
#     num[i][0] = A[i]
# num.sort(reverse=1)
# print(num)

n = int(input())
A = list(map(int, input().split()))
B = [-1 for _ in range(n)]
for i in range(n):
    for j in range(i + 1, n):
        if A[i] < A[j]:
            B[i] = A[j]
            break
        else:
            B[i] = -1

print(*B)
