isbn = "9780921418"

for _ in range(3):
    isbn += input()

result = 0
for i in range(13):
    if i % 2 == 0:
        result += int(isbn[i]) * 1
    else:
        result += int(isbn[i]) * 3
print(f"The 1-3-sum is {result}")
