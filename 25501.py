def recursion(s, l, r, i):
    if l >= r:
        return [1, i + 1]
    elif s[l] != s[r]:
        return [0, i + 1]
    else:
        return recursion(s, l + 1, r - 1, i + 1)


def isPalindrome(s):
    return recursion(s, 0, len(s) - 1, 0)


n = int(input())
for _ in range(n):
    print(*isPalindrome(input()))
