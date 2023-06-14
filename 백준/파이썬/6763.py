limit = int(input())
speed = int(input())

speeding = speed - limit

if speeding <= 0:
    print("Congratulations, you are within the speed limit!")
elif speeding <= 20:
    print("You are speeding and your fine is $100.")
elif speeding <= 30:
    print("You are speeding and your fine is $270.")
else:
    print("You are speeding and your fine is $500.")
