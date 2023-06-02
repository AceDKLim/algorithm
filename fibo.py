# def fibo(n):
#     if n < 3:
#         return 1
#     return fibo(n - 1) + fibo(n - 2)


# n = int(input())
# print(fibo(n))

# fibo 0, fibo 1, fibo2
fibo_list = [1, 1]


def fibo(n):
    for i in range(2, n):
        fibo_list.append(fibo_list[i - 2] + fibo_list[i - 1])
    return fibo_list[n - 1]


n = int(input())
print(fibo(n))
