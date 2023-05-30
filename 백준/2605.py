n = int(input())
student = [1]
num = list(map(int, input().split()))

for i in range(1, n):
    student.insert(i - num[i], i + 1)
print(*student)
