import sys

n, m = map(int, sys.stdin.readline().rstrip().split())

words = {}

for _ in range(n):
    word = sys.stdin.readline().rstrip()
    if len(word) >= m:
        if word in words:
            words[word] += 1
        else:
            words[word] = 1

words = sorted(words.keys(), key=lambda x: (-words[x], -len(x), x))
for i in words:
    print(i)
