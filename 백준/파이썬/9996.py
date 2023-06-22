from sys import stdin

input = stdin.readline
n = int(input())
s, e = input().split("*")
sl = len(s)
el = len(e)

for i in range(n):
    result = 0
    t = input()
    for j in range(len(t)):
        if result == 0 and t[j] == s[0] and "".join(t[j : j + sl]) == s:
            result += 1
        if result == 1 and t[j] == e[0] and "".join(t[j : j + el]) == e:
            result += 1
            break

    if result == 2:
        print("DA")
    else:
        print("NE")
