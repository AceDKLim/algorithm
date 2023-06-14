spell = {
    "a": "aespa",
    "b": "baekjoon",
    "c": "cau",
    "d": "debug",
    "e": "edge",
    "f": "firefox",
    "g": "golang",
    "h": "haegang",
    "i": "iu",
    "j": "java",
    "k": "kotlin",
    "l": "lol",
    "m": "mips",
    "n": "null",
    "o": "os",
    "p": "python",
    "q": "query",
    "r": "roka",
    "s": "solvedac",
    "t": "tod",
    "u": "unix",
    "v": "virus",
    "w": "whale",
    "x": "xcode",
    "y": "yahoo",
    "z": "zebra",
}
from collections import deque

n = deque(input())
r = ""
result = True
while n:
    t = n.popleft()
    l = len(spell[t])
    s = spell[t]
    if len(n) - 1 >= l:
        for _ in range(l - 1):
            t += n.popleft()
        print(t, s)
        if t != s:
            result = False
        elif result == True:
            r += t[0]
    elif len(n) - 1 < l:
        print(1)
        result = False
    print(n)

if result == True:
    print("It's HG!")
    print(r)
else:
    print("ERROR!")
