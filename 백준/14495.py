n = int(input())
fibo = [0, 1, 1, 1]
for i in range(3, n + 1):
    fibo.append((fibo[i - 1] + fibo[i - 3]) % 1000000007)
print(fibo[n])
