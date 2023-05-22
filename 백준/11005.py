n, b = map(int, input().split())

result = ""

while n > 0:
    n, mod = divmod(n, b)
    if mod > 9:
        mod = chr(mod + 55)
    result += str(mod)

print(result[::-1])
