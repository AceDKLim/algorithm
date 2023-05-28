# arr->배열, p-> 시작인덱스 r->끝인덱스
def merge_sort(arr, p, r):
    if p < r:
        # q->중간 인덱스
        q = (p + r) // 2
    else:
        return 0
    merge_sort(arr, p, q)
    merge_sort(arr, q + 1, r)
    merge(arr, p, r)


def merge(arr, p, r):
    for i in sorted(arr[p : r + 1]):
        result.append(i)


a, k = map(int, input().split())
arr = list(map(int, input().split()))
result = []
merge_sort(arr, 0, a - 1)
if len(result) < k:
    print(-1)
else:
    print(result[k - 1])
