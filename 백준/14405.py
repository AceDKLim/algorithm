from collections import deque

pika = ["pi", "ka", "chu"]

s = deque(input())

result = "YES"
while s:
    w = s.popleft()
    if (w == "p" or w == "k") and len(s) >= 1:
        w += s.popleft()
        if w not in pika:
            result = "NO"
            break
    elif w == "c" and len(s) >= 2:
        w += s.popleft()
        w += s.popleft()
        if w not in pika:
            result = "NO"
            break
    else:
        result = "NO"
        break

print(result)
