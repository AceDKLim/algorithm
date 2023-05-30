n = int(input())

for i in range(n):
    l = list(input().split())
    l.reverse()
    print(f"Case #{i+1}:", " ".join(l))
