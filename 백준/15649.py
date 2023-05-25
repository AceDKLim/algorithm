n, m = map(int, input().split())
result = []


def BT():
    if len(result) == m:
        print(*result)
    else:
        for i in range(1, n + 1):
            if i not in result:
                result.append(i)
                BT()
                result.pop()


BT()
