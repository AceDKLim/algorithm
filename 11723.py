from sys import stdin

input = stdin.readline
s = set()
s1 = set([str(i) for i in range(1, 21)])
m = int(input())
for _ in range(m):
    command = list(map(str, input().rstrip().split()))
    if command[0] == "add":
        s.add(command[1])
    elif command[0] == "remove":
        if command[1] in s:
            s.remove(command[1])
    elif command[0] == "check":
        if command[1] in s:
            print(1)
        else:
            print(0)
    elif command[0] == "toggle":
        if command[1] in s:
            s.remove(command[1])
        else:
            s.add(command[1])
    elif command[0] == "all":
        s = s1 | s
    elif command[0] == "empty":
        s.clear()
