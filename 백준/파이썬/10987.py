mo = ["a", "e", "i", "o", "u"]
n = input()
cnt = 0

for i in n:
    if i in mo:
        cnt += 1

print(cnt)
