n = int(input())
p = int(input())
p_l = []
if n >= 20:
    p_l.append(int(p * 0.75))
if n >= 15:
    p_l.append(int(p - 2000))
if n >= 10:
    p_l.append(int(p * 0.9))
if n >= 5:
    p_l.append(int(p - 500))

if min(p_l) < 0:
    print(0)
else:
    print(min(p_l))
