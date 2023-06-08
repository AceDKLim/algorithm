from collections import deque

string = input()
n = int(input())
cnt = 0
for _ in range(n):
    ring = deque(input())
    # 반지의 시작 단어가 문자열 처음 아니고 들어 있으면 뒤로 넣음
    while ring[0] in string and ring[0] != string[0]:
        ring.append(ring.popleft())
    for i in range(10):
        if ring[i] not in string:
            ring[i] = ""
    if string in "".join(ring):
        cnt += 1

print(cnt)
