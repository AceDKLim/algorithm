school = list(map(int, input().split()))
school_name = ["Soongsil", "Korea", "Hanyang"]


if sum(school) >= 100:
    print("OK")
else:
    print(school_name[school.index(min(school))])
