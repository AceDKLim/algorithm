import string

lspell = list(string.ascii_lowercase)
uspell = list(string.ascii_uppercase)
poem = input()
space = int(input())
keyboard = list(map(int, input().split()))
result = ""

for i in range(len(poem)):
    if poem[i] == poem[i - 1]:
        continue
    elif poem[i] == " ":
        space -= 1
        if space < 0:
            result = -1
            break
    elif i == 0 or poem[i - 1] == " ":
        s = uspell.index(poem[i]) if poem[i] in uspell else lspell.index(poem[i])
        keyboard[s] -= 2
        result += poem[i].upper()
        if keyboard[s] < 0:
            result = -1
            break
    else:
        s = uspell.index(poem[i]) if poem[i] in uspell else lspell.index(poem[i])
        keyboard[s] -= 1
        if keyboard[s] < 0:
            result = -1
            break
print(result)
