n = int(input())

secret = list(map(int, input().split()))
s_dict = {}

for i in secret:
    if i not in s_dict:
        s_dict[i] = 1
    else:
        s_dict[i] += 1
secret.sort()
print(secret)
word = input()

# for i in word:
#     if
