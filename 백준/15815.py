calculater = {"+": 1, "-": 2, "*": 3, "/": 4}
n = input()
nums = []
for i in n:
    if i in calculater:
        a = nums.pop()
        b = nums.pop()
        if calculater[i] == 1:
            nums.append(b + a)
        elif calculater[i] == 2:
            nums.append(b - a)
        if calculater[i] == 3:
            nums.append(b * a)
        if calculater[i] == 4:
            nums.append(int(b / a))

    else:
        nums.append(int(i))
print(nums[0])
