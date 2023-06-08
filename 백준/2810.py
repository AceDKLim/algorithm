n = int(input())
seat = list(input())
cnt = 1

while seat:
    s = seat.pop()
    if s == "S":
        cnt += 1
    else:
        seat.pop()
        cnt += 1

print(min(cnt, n))
