n, l = map(int, input().split())

w = list(map(int, input().split()))
w.sort()

tape = 1
s = w.pop() - l + 1
while w:
    t = w.pop()
    if t < s:
        tape += 1
        s = t - l + 1

print(tape)
