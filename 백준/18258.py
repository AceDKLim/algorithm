def push_(c, s):
    s.append(c[5:])
    return s


def pop_(s):
    if len(s) == 0:
        print(-1)
    else:
        print(s.popleft())


def size_(s):
    print(len(s))


def empty_(s):
    if len(s) == 0:
        print(1)
    else:
        print(0)


def front_(s):
    if len(s) == 0:
        print(-1)
    else:
        print(s[0])


def back_(s):
    if len(s) == 0:
        print(-1)
    else:
        print(s[-1])


import sys
from collections import deque

n = int(sys.stdin.readline().rstrip())
s = deque([])
for _ in range(n):
    c = sys.stdin.readline().rstrip()
    d = {"pop": pop_, "size": size_, "empty": empty_, "front": front_, "back": back_}
    if c in d:
        d[c](s)
    else:
        push_(c, s)
