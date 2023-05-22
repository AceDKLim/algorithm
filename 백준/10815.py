from sys import stdin

n = int(stdin.readline())
n_l = set(map(int, stdin.readline().split()))
m = int(stdin.readline())
m_l = tuple(map(int, stdin.readline().split()))

for i in m_l:
    if i in n_l:
        print(1, end=" ")
    else:
        print(0, end=" ")
