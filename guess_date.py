date = 29
guess = int(input("Enter date of month....press 0 to stop guessing: : "))

while guess != date:
    guess = int(input("Enter date of month....press 0 to stop guessing: "))

    if guess == date:
        print("Correct Guess")
    
    else:
        print("Incorrect Guess")


