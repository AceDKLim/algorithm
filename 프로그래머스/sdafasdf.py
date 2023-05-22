import sys

n, m = map(int, sys.stdin.readline().split())

pokemon_dict = dict()
idx = []

for i in range(1, n + 1):
    pokemon_dict[sys.stdin.readline().rstrip()] = i
else:
    idx = list(pokemon_dict.keys())

# for _ in range(m):
#     question = sys.stdin.readline().rstrip()
#     if question.isdigit():
#         print(idx[int(question) - 1])
#     else:
#         print(pokemon_dict[question])
print(pokemon_dict)
print(idx)
