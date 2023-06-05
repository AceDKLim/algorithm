string = input().split()

result = "yes"
while string:
    s = string.pop()
    if s in string:
        result = "no"
        break

print(result)
