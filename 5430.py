from collections import deque
from sys import stdin

t = int(stdin.readline().rstrip())
for _ in range(t):
    command = stdin.readline().rstrip()
    n = int(stdin.readline().rstrip())
    d = deque(list(map(str, stdin.readline().rstrip().replace(",", " ")[1:-1].split())))
    r = 0
    for i in command:
        if i == "R":
            r += 1
        elif i == "D":
            if len(d) == 0:
                d.append("error")
                break
            elif r % 2 == 1:
                d.pop()
            else:
                d.popleft()
    if "error" in d:
        print("error")
    elif r % 2 == 0:
        print("[" + ",".join(d) + "]")
    else:
        d.reverse()
        print("[" + ",".join(d) + "]")
