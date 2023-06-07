# # 행렬 곱셈
# def multi_procession(q, r):
#     result = [[0, 0], [0, 0]]
#     for i in range(2):
#         for j in range(2):
#             for p in range(2):
#                 result[i][p] += r[i][j] * q[j][p]
#                 result[i][p] %= 1000000007
#     return result


# # p의 n승
# def multy(n, p):
#     if n == 1:
#         return p
#     h_p = multy(n // 2, p)
#     if n % 2 == 0:
#         return multi_procession(h_p, h_p)
#     else:
#         return multi_procession(multi_procession(h_p, h_p), p)


# import sys

# sys.setrecursionlimit(10**9)

# n = int(input())
# A = [[0, 1], [1, 1]]
# print(multy(n - 1, A))
