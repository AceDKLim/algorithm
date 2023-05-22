m, n = map(int, input().split())
tomato = []
ones=[]
for i in range(n):
    line = list(map(int, input().split()))
    if 1 in line:
        ones.append(i,line.index(1))
    tomato.append(line)

dx=[1]
def bfs(x,y):
    
