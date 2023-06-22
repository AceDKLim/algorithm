score = [0, 0]
awintime = [0, 0]
bwintime = [0, 0]
nowtime = [0, 0]
n = int(input())
for _ in range(n):
    team, time = input().split()
    score[int(team) - 1] += 1
    if score[0]>score[1]:
        