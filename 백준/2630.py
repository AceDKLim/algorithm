n = int(input())
paper = []
for _ in range(n):
    paper.append(input().split())
blue_count = 0
white_count = 0


def count_paper(p):
    global blue_count
    global white_count
    bc = 0
    wc = 0
    for i in p:
        wc += i.count("0")
        bc += i.count("1")
    if wc == 0:
        blue_count += 1
    elif bc == 0:
        white_count += 1
    else:
        l1 = []
        l2 = []
        l3 = []
        l4 = []
        size = len(p) // 2
        l = len(p[0]) // 2
        for i in range(size):
            l1.append(p[i][:l])
            l2.append(p[i][l:])
        for i in range(size, size * 2):
            l3.append(p[i][:l])
            l4.append(p[i][l:])
        count_paper(l1)
        count_paper(l2)
        count_paper(l3)
        count_paper(l4)


count_paper(paper)
print(white_count)
print(blue_count)
