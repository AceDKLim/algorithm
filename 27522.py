arr = [list(map(str, input().split())) for _ in range(8)]

r = b = 0
score = 10

for i in range(8):
    arr[i].insert(1, arr[i][0].split(':'))
    arr[i].pop(0)
arr = sorted(arr)

for i in range(8):
    if i < 2:
        if arr[i][1] == 'B':
            b += score
            score -= 2
        elif arr[i][1] == 'R':
            r += score
            score -= 2
    else:
        if arr[i][1] == 'B':
            b += score
            score -= 1
        elif arr[i][1] == 'R':
            r += score
            score -= 1

if r < b:
    print('Blue')
else:
    print('Red')
