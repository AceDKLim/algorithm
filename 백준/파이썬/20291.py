from sys import stdin

input = stdin.readline
n = int(input())

word = {}
for i in range(n):
    a, b = input().rstrip().split(".")
    if b in word:
        word[b] += 1
    else:
        word[b] = 1

word = sorted(word.items())
for i in word:
    print(i[0], i[1])
