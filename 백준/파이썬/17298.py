n = int(input())
A = list(map(int, input().split()))

result = [-1] * n
n -= 1
while A:
    a = A.pop()
    n -= 1
    for j in range(-1, -n - 1, -1):
        if A[j] < a:
            result[n] = a
        else:
            break
print(*result)
