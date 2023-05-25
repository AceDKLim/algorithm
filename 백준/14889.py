# l-> 쪼갤 크기 n->중간 체크 인덱스
def BT(n, l, r):
    if len(team1) == l:
        team2 = []
        for i in team1:
            team2.append(t - i - 1)

        print(team1)
        # BT2(team1, 0)
        # t1 = sum(r)
        # r.clear()

        # print(team2)
        # BT2(team2, 0)
        # t2 = sum(r)
        # r.clear()

        # result.append(abs(t1 - t2))
        return
    for i in range(n, l + 1):
        if i not in team1:
            team1.append(i)
            BT(team1[-1], l, r)
            team1.pop()


m = []
r = []
result = []


# def BT2(team, n):
#     if len(m) == 2:
#         # a, b = m[0], m[1]
#         # r.append(member[a][b] + member[b][a])
#         print(m[0], m[1])
#         return
#     for i in range(n, len(team)):
#         if team[i] not in m:
#             m.append(team[i])
#             BT2(team, n + 1)
#             m.pop()


t = int(input())
team1 = []
member = []
for _ in range(t):
    member.append(list(map(int, input().split())))
BT(0, t, r)
# print(result)
