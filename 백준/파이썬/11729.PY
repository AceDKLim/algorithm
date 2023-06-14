n = int(input())

l1 = [i for i in range(n, 0, -1)]
l2 = []
l3 = []
result = []


# 결과, 배열3개, 옮길 숫자, 현재 배열, 옮길 배열
def hanoi(result, l1, l2, l3, n, m, t):
    a = {1: l1, 2: l2, 3: l3}
    if n == 1:
        a[t].append(a[m].pop())
        result.append([m, t])
    else:
        hanoi(result, l1, l2, l3, n - 1, m, 6 - m - t)
        a[t].append(a[m].pop())
        result.append([m, t])
        hanoi(result, l1, l2, l3, n - 1, 6 - m - t, t)
    return result


l = hanoi(result, l1, l2, l3, n, 1, 3)
print(len(l))
for i in l:
    print(*i)
