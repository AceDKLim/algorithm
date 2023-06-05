problem = {"L": 120, "S": 150, "B": 150, "N": 40, "C": 160, "D": 100, "R": 100, "O": 100}

while 1:
    problems = {}
    flight = input()
    if flight == "#":
        break
    while 1:
        seat = input()
        if seat == "00A":
            break
        s, p = seat.split()
        if s in problems and p in problem:
            problems[s] += problem[p]
        elif p in problem:
            problems[s] = problem[p]
    cnt = 0
    for i in problems.values():
        if i >= 200:
            cnt += 1
    print(flight, cnt)
