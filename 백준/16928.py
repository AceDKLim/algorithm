from collections import deque

n, m = map(int, input().split())
move = {}
game = [1e9] * 101
for _ in range(n + m):
    a, b = map(int, input().split())
    move[a] = b

game[1] = 0
q = deque([1])
d = [1, 2, 3, 4, 5, 6]

while q:
    t = q.popleft()
    if t in move:
        if game[move[t]] > game[t]:
            game[move[t]] = game[t]
            q.append(move[t])
        continue
    for i in range(6):
        n = t + d[i]
        if n > 100:
            continue
        if game[t] + 1 <= game[n]:
            game[n] = game[t] + 1
            q.append(n)
print(game[100])
