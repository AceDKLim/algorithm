def solution(numbers, hand):
    answer = []
    l = 10
    r = 12
    for i in numbers:
        if (i == 0):
            i += 11
        if (i % 3 == 1):
            answer.appdend("L")
            l = i
        elif (i % 3 == 0):
            answer.appdend("R")
            r = i
        else:
            d_l = abs(l-i)//3+abs(l-i) % 3
            d_r = abs(r-i)//3+abs(r-i) % 3
            if (d_l > d_r):
                answer.appdend("L")
                l = i
            elif (d_r > d_l):
                answer.appdend("R")
                r = i
            else:
                if (hand == "right"):
                    answer.appdend("R")
                    r = i
                elif (hand == "left"):
                    answer.appdend("L")
                    l = i
    a = "".join(answer)
    return a
