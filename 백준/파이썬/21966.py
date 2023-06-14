n = int(input())
s = input()
if n <= 25:
    print(s)
elif "." in s[11:-12]:
    print(s[:9] + "......" + s[-10:])
else:
    print(s[:11] + "..." + s[-11:])
