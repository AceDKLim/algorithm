n = int(input())
spell = [0, 1, 2]

for i in range(3, n + 1):
    spell.append((spell[i - 1] + spell[i - 2]) % 15746)

print(spell[n])
