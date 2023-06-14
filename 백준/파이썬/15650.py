n, m = map(int, input().split())
result = []


def BT(c):
    if len(result) == m:
        print(*result)
    else:
        for i in range(c, n + 1):
            if i not in result:
                result.append(i)
                BT(result[-1])
                result.pop()


BT(1)
