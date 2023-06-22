prime = [True for _ in range(100001)]

for i in range(2, 100001):
    if prime[i] == True:
        for j in range(i * 2, 100001, i):
            prime[j] = False

while True:
    n = input()
    if n == "0":
        break
    r = 0
    for i in range(len(n)):
        for j in range(i + 1, len(n)):
            t = int(n[i:j])
            if t <= 100000 and prime[t] == True:
                r = max(r, t)
    print(r)
