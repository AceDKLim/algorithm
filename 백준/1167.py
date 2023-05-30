# 최소신장트리 이용 최대 신장 트리
# 리스트로 받아서 -1무시, 짝수가 노드 번호 홀수가 거리
# 입력은 튜플로 받아서 비용, 출발, 도착 순으로 넣고 방문 안했으면 비용 제일 긴 것부터 더하자!
# v->트리 개수, tree->입력 배열, visit->방문 여부 체크, result->비용 여부


def find_parent(parent, x):
    if parent[x] == x:
        return parent[x]
    parent[x] = find_parent(parent, parent[x])


def union_parent(parent, x, y):
    print(x, y)
    x = find_parent(parent, x)
    y = find_parent(parent, y)
    print(x, y)
    if x > y:
        parent[y] = x
    else:
        parent[x] = y


v = int(input())
tree = []
visit = [i for i in range(v + 1)]
result = 0
for _ in range(v):
    n = list(map(int, input().split()))
    n.pop()
    x = n[0]
    for j in range(1, len(n), 2):
        if (n[j + 1], n[j], x) not in tree:
            tree.append((n[j + 1], x, n[j]))

tree.sort(reverse=1)

for n in tree:
    a, b, c = n
    print(find_parent(visit, b), find_parent(visit, c))
    print(result)
    if find_parent(visit, b) != find_parent(visit, c):
        union_parent(visit, b, c)
        result += a
print(result)
