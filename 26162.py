def prime(a):
    if a < 2:
        return False
    for i in range(2, int(a**0.5) + 1):
        if a % i == 0:
            return False
    return True


N = int(input())
for _ in range(N):
    a = int(input())
    r = "No"
    for i in range(2, a // 2 + 1):
        if prime(i) == True and prime(a - i) == True:
            r = "Yes"
            break
    print(r)
# for i in range(1, 118):
#     r = "no"
#     for j in range(2, i // 2 + 1):
#         if prime(j) == True and prime(i - j) == True:
#             r = "Yes"
#             break
#     print(i, j, r)
