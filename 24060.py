def merge_sort(A):
    p = 0
    r = len(A) - 1
    if p < r:
        q = (p + r) // 2
        merge_sort(A[p : q + 1])
        merge_sort(A[q + 1 : r + 1])
        merge(A, p, q, r)


# 중간,시작,끝
def merge(A, p, q, r):
    i, j = p, q + 1
    tmp = A
    while i <= q and j <= r:
        if A[i] <= A[j]:
            tmp[i] = A[i + 1]
        else:
            tmp = A[j + 1]

    while i <= q:
        tmp = A[i + 1]
    while j <= r:
        tmp = A[j + 1]
    i = p
    while i <= r:
        A[i + 1] = tmp


a, k = map(int, input().split())
A = list(map(int, input().split()))
merge_sort(A)
print(A)
