# from sys import stdin

# input = stdin.readline
# n = int(input())
# result = []
# if n == 1:
#     m = list(map(int, input().split()))
#     print(max(m), min(m))
# else:
#     m = list(map(int, input().split()))
#     for i in range(3):
#         result.append((m[i], m[i]))
#     for i in range(1, n):
#         m = list(map(int, input().split()))
#         r = []
#         for j in range(3):
#             g = m[j]
#             if j == 0:
#                 maxv = max(g + result[j][1], g + result[j + 1][1])
#                 minv = min(g + result[j][0], g + result[j + 1][0])
#             elif j == 2:
#                 maxv = max(g + result[j][1], g + result[j - 1][1])
#                 minv = min(g + result[j][0], g + result[j - 1][0])
#             else:
#                 maxv = max(g + result[j][1], g + result[j - 1][1], g + result[j + 1][1])
#                 minv = min(g + result[j][0], g + result[j - 1][0], g + result[j + 1][0])
#             r.append((minv, maxv))
#         result = r
#     minv = 1e9
#     maxv = -1e9
#     for i in result:
#         a, b = i
#         minv = min(minv, a)
#         maxv = max(maxv, b)
#     print(maxv, minv)


#
# from sys import stdin

# input = stdin.readline
# n = int(input())
# if n == 1:
#     m = list(map(int, input().split()))
#     print(max(m), min(m))
# else:
#     a, b, c = map(int, input().split())
#     x, y, z = (a, a), (b, b), (c, c)
#     for i in range(1, n):
#         a, b, c = map(int, input().split())
#         maxv1 = max(a + max(x), a + max(y))
#         minv1 = min(a + min(x), a + min(y))

#         maxv2 = max(b + max(y), b + max(x), b + max(z))
#         minv2 = min(b + min(y), b + min(x), b + min(z))

#         maxv3 = max(c + max(z), c + max(y))
#         minv3 = min(c + min(z), c + min(y))
#         x, y, z = (minv1, maxv1), (minv2, maxv2), (minv3, maxv3)
#     maxv = max(max(x), max(y), max(z))
#     minv = min(min(x), min(y), min(z))

#     print(maxv, minv)


from sys import stdin

input = stdin.readline
n = int(input())
maxv1 = maxv2 = maxv3 = 0
minv1 = minv2 = minv3 = 0

for _ in range(n):
    a, b, c = map(int, input().split())
    maxv1, maxv2, maxv3 = max(maxv1, maxv2) + a, max(maxv1, maxv2, maxv3) + b, max(maxv2, maxv3) + c
    minv1, minv2, minv3 = min(minv1, minv2) + a, min(minv1, minv2, minv3) + b, min(minv2, minv3) + c

print(max(maxv1, maxv2, maxv3), min(minv1, minv2, minv3))
