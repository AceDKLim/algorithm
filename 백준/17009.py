Apples = 0
Bananas = 0
for i in range(3):
    Apples += (3 - i) * int(input())
for i in range(3):
    Bananas += (3 - i) * int(input())

if Apples > Bananas:
    print("A")
elif Apples < Bananas:
    print("B")
else:
    print("T")
