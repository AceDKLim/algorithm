n = input()

result = "NO"
for i in range(1, len(n)):
    a = n[:i]
    b = n[i:]
    m_a = 1
    for j in a:
        m_a *= int(j)
    m_b = 1
    for j in b:
        m_b *= int(j)
    if m_a == m_b:
        result = "YES"
        break
print(result)
