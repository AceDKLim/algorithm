# a = list(range(10))
# n = int(input())
# sum = 0

# i_count = 0
# j_count = 0
# k_count = 0

# for i in range(1, n - 1):
#     i_count += 1
#     # print("i=", i_count)
#     for j in range(i + 1, n):
#         j_count += 1
#         # print("j=", j_count)
#         for k in range(j + 1, n + 1):
#             k_count += 1
#             # print("k=", k_count)
#             sum = sum + a[i] * a[j] * a[k]

# print(n, i_count, j_count, k_count)

n = int(input())
print((n - 2) * (n - 1) // 2 * n // 3)
print(3)
