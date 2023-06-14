l = int(input())
s = input()
n = 0
for i in range(l):
    n += (ord(s[i]) - 96) * 31**i
print(n % 1234567891)
