import heapq

t = int(input())
for _ in range(t):
    n = int(input())
    l = list(map(int, input().split()))
    r = []
    for i in l:
        heapq.heappush(r, i)
    result = 0

    while len(r) >= 2:
        a = heapq.heappop(r)
        b = heapq.heappop(r)
        s = a + b
        heapq.heappush(r, s)
        result += s
    print(result)
