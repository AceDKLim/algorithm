# state(상태) -> 가로, 세로 대각선(0,1,2)3개 부여
# 이동시 주의 3가지 v_nx,v_ny/l_nx,l_ny/d_nx,d_ny 생성
# 상태 따라 할 수 있는 이동 결정 후 bfs로 이동 가능한 위치에 숫자 표시

n = int(input())
m = list(list(map(int, input().split())))

v_nx = [0, 0]
