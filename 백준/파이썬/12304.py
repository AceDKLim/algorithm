t = int(input())

for i in range(1, t + 1):
    result = []
    n = int(input())
    tag = list(map(int, input().split()))
    tag.sort()
    while tag:
        p = int(tag.pop() * 0.75)
        tag.remove(p)
        result.append(p)
    print(f"Case #{i}:", *result[::-1])
