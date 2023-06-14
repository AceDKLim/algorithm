string = input()
n = int(input())
spell = list(list(input()) for _ in range(n))

while string:
    for i in spell:
        l=len(i)
        if string[0:l+1]==i:
            for _ in range(l):
                
