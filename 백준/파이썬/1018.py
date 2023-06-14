# 체스판, 시작지점 좌표(i,j), 기준 0,0값(pin1,pin2) 받아서 칠해야 하는 수 출력
def min_value(i, j, pin, pin2, chess):
    c = 0
    for k in range(8):
        if k % 2 == 0:
            c += chess[j + k][i : i + 8 : 2].count(pin2) + chess[j + k][i + 1 : i + 8 : 2].count(
                pin
            )
        else:
            c += chess[j + k][i : i + 8 : 2].count(pin) + chess[j + k][i + 1 : i + 8 : 2].count(
                pin2
            )
    return c


# 체스판 입력 받음
n, m = map(int, input().split())
chess = []
for _ in range(n):
    chess.append(input())

# 최대 64
min_color = 65
# 체스판 가로8, 세로n 가능한 개수만큼 루프
for i in range(m - 7):
    # 가로 8 안에서 세로8 가능한 수만큼 루프
    for j in range(n - 7):
        # 0,0이 W되는 경우, B 되는 경우, 기존 최소값 비교
        min_color = min(
            min_color, min_value(i, j, "W", "B", chess), min_value(i, j, "B", "W", chess)
        )
print(min_color)
