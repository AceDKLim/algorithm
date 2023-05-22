mo = ["a", "e", "i", "o", "u"]
n = int(input())
word = input()
c = 0
for i in word:
    if i in mo:
        c += 1

print(c)
