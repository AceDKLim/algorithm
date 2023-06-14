# nCk  구하기
n, k = map(int, input().split())
m = 1000000007


# 팩토리얼 구하는 함수+m으로 계속 나눠 숫자 안커지게
def fact(n, m):
    result = 1
    for i in range(2, n + 1):
        result *= i
        result %= m
    return result


# num의 n승 빠르게 구하기
def square(num, n, m):
    if n == 1:
        return num % m
    sq = square(num, n // 2, m)
    # 짝수승이면 # a^n = a^(n/2) * a^(n/2) 이용, m으로 나눈 나머지 바로 출력
    if n % 2 == 0:
        return (sq * sq) % m
    # 홀수 승이면a^n = a^((n/2)-1) * a^((n/2)-1) * a
    else:
        return (sq * sq * num) % m


# n!
A = fact(n, m)

# 유사 n-k!
B = fact(n - k, m)

# 유사 k!
C = fact(k, m)

# 유사 n-k!와 유사 k! 곱하고 m-2제곱 후 A와 곱!
result = A * square(B * C, m - 2, m) % m

print(result)
