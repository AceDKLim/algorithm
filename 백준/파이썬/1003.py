z_counter = [1, 0]
o_counter = [0, 1]


for i in range(2, 41):
    z_counter.append(z_counter[i - 2] + z_counter[i - 1])
    o_counter.append(o_counter[i - 2] + o_counter[i - 1])


n = int(input())
for _ in range(n):
    num = int(input())
    print(z_counter[num], o_counter[num])
