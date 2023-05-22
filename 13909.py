n = int(input())

count = 1
window = 0
i = 3
while window + i < n:
    count += 1
    window += i
    i += 2

print(count)
