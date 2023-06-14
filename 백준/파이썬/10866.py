from sys import stdin as st
from collections import deque

input = st.readline

n = int(input())
s = deque()
for _ in range(n):
    commmand = input().replace("_", " ").split()
    if commmand[0] == "push":
        if commmand[1] == "back":
            s.append(commmand[2])
        else:
            s.appendleft(commmand[2])
    elif commmand[0] == "pop":
        if len(s) == 0:
            print(-1)
        elif commmand[1] == "back":
            print(s.pop())
        else:
            print(s.popleft())
    elif commmand[0] == "size":
        print(len(s))
    elif commmand[0] == "empty":
        if len(s) == 0:
            print(1)
        else:
            print(0)
    elif commmand[0] == "back":
        if len(s) == 0:
            print(-1)
        else:
            print(s[-1])
    elif commmand[0] == "front":
        if len(s) == 0:
            print(-1)
        else:
            print(s[0])
