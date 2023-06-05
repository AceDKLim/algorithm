from sys import stdin


input = stdin.readline
k, l = map(int, input().split())

student = {}

for i in range(l):
    student[input().rstrip()] = i

student = sorted(student.items(), key=lambda x: x[1])
for i in range(min(k, len(student))):
    print(student[i][0])
