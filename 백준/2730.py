n = int(input)

month = []

for _ in range(n):
    close, write = input().split()
    c_m, c_d, c_y = close.split("/")
    w_m, w_d = write.split("/")
