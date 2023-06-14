from sys import stdin as st

input = st.readline

n = int(input())
s = []
for _ in range(n):
    commmand = input().split()
    if commmand[0] == "push":
        s.append(commmand[1])
    elif commmand[0] == "pop":
        if len(s) == 0:
            print(-1)
        else:
            print(s.pop())
    elif commmand[0] == "size":
        print(len(s))
    elif commmand[0] == "empty":
        if len(s) == 0:
            print(1)
        else:
            print(0)
    elif commmand[0] == "top":
        if len(s) == 0:
            print(-1)
        else:
            print(s[-1])
