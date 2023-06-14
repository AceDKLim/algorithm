n = int(input())
A = list(map(int, input().split()))
result_array = []
result_len = [1 for _ in range(n)]

for i in range(n):
    result_array.append([A[i]])
    for j in range(i):
        if A[i] > A[j]:
            if result_len[i] < result_len[j] + 1:
                result_len[i] = result_len[j] + 1
                result_array[i] = result_array[j] + [A[i]]

print(result_array)
print(result_len)
m = max(result_len)
r = result_array[result_len.index(m)]
print(m)
print(*r)
