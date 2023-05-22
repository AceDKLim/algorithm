arr = []

for _ in range(9):
    arr.append(list(map(int, input().split())))

max = m_c = m_r = 0

for i in range(9):
    for j in range(9):
        if arr[i][j] >= max:
            max = arr[i][j]
            m_c = i + 1
            m_r = j + 1

print(f"{max}\n{m_c} {m_r}")
