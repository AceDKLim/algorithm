arr = []

for _ in range(5):
    arr.append(input())

result = ""
for i in range(15):
    for j in range(5):
        try:
            if arr[j][i]:
                result += arr[j][i]
        except:
            continue

print(result)
