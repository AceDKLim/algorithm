fibo = [0, 1]
for i in range(2, 10001):
    fibo.append(fibo[i - 1] + fibo[i - 2])

n = int(input())
for i in range(1, n + 1):
    p, q = map(int, input().split())
    print(f"Case #{i}: {fibo[p]%q}")
