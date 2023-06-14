import math as m

n = int(input())


def decimal(n):
    for i in range(2, int(m.sqrt(n) + 1)):
        if n % i == 0:
            return 0
    return 1


for _ in range(n):
    num = int(input())
    if num == 0 or num == 1:
        print(2)
    else:
        while decimal(num) == 0:
            num += 1
        print(num)
