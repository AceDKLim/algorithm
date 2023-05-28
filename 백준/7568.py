# 인원수 받아 인원수 만큼 people에 저장
n = int(input())
people = []
for i in range(n):
    people.append(list(map(int, input().split())))


score = [1] * (n)

for i in range(n):
    for j in range(n):
        if people[i][0] > people[j][0] and people[i][1] > people[j][1]:
            score[j] += 1

print(*score)
