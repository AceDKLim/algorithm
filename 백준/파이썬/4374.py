import string
from sys import stdin

input = stdin.readline
s = string.ascii_letters

while True:
    try:
        n = int(input())
        d = {}
        while True:
            t = input().rstrip()
            if t == "EndOfText":
                break
            t = t.split()
            for i in t:
                for j in i:
                    if j not in s:
                        i = i.replace(j, "")
                if i.lower() != i.upper():
                    i = i.lower()
                    if i not in d:
                        d[i] = 1
                    else:
                        d[i] += 1
        d = sorted(d.items())
        cnt = 0
        for i in d:
            if i[1] == n:
                print(i[0])
                cnt += 1
        if cnt == 0:
            print("There is no such word.")
        print()
    except:
        break
