n = int(input())
nums = list(map(int, input().split()))
add, sub, mul, div = map(int, input().split())

max_v = -1e9
min_v = 1e9


def dfs(i, num):
    global add, sub, mul, div, min_v, max_v
    if i == n:
        max_v = max(max_v, num)
        min_v = min(min_v, num)
        return
    if add:
        add -= 1
        dfs(i + 1, num + nums[i])
        add += 1
    if sub:
        sub -= 1
        dfs(i + 1, num - nums[i])
        sub += 1
    if mul:
        mul -= 1
        dfs(i + 1, num * nums[i])
        mul += 1
    if div:
        div -= 1
        dfs(i + 1, int(num / nums[i]))
        div += 1


dfs(1, nums[0])
print(max_v)
print(min_v)
