n = int(input())
n_l = set(map(int, input().split()))
m = int(input())
m_l = tuple(map(int, input().split()))
for i in range(m):
    if m_l[i] in n_l:
        print(1)
    else:
        print(0)
