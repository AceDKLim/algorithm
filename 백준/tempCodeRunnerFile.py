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