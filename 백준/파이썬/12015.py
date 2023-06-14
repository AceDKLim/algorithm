n = int(input())
a = list(map(int, input().split()))


def mis(l):
    if len(l) == 2:
        if l[0] < l[1]:
            return (2, l[0], l[1])
        else:
            return (1, l[1], l[0])
    if len(l) == 1:
        return (1, l[0], l[0])
    l = len(l)
    lx, lmin, lmax = mis(l[: n // 2])
    rx, rmin, rmax = mis(l[n // 2 :])
    if lmax < rmin:
        return (lx + rx, lmin, rmax)
    if 
