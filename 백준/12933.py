n = input()
cnt = 0

while "quack" in n:
    cnt += n.count("quack")
    n = n.replace("quack", "")

print(cnt)
