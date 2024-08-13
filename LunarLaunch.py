import math
from print_utilities import print_slow
from countdown import countdown

print_speed = 13
print_slow("Hello there, want to play a game?", print_speed)
answer1 = input("'yes' or 'no'?:  ")
if answer1 == "yes":
    print_slow("I thought you'd might.",print_speed)
elif answer1=="no":
    print_slow("Then why are we doing this?", print_speed)
    exit()
else:
    print_slow("Can't you follow instructions?", print_speed)
    exit()
if answer1=="yes":
    print_slow("We are on the surface of the moon.", print_speed)
    print_slow("We have a propulsion system that instantly converts all energy into kinetic energy.", print_speed)
    print_slow("We also have a lunar lander and crew that can withstand infiniate acceloration...", print_speed)
    print_slow("Your goal is to reach a maximum height without being flung out to space.\n", print_speed)
    
fuel = eval(input("How many pounds of fuel should we burn?: "))
#assuming 1 lb of fuel is 1000 joules of kinetic energy
# So we need to do some separation of responsibilities here. Let's put the fuel to veloctiy calculation in its own
# function so that we can play around with it separately from the main flow here.

countdown(5)


fuel=fuel*10000
mass = 1000
#mass in kg
gravity = 1.625
#gravity in m/2^2
velocity = math.sqrt(2*fuel/mass)
#velocity in m/s. Escape velocity of the moon is 2,380 m/s
height =  (fuel / (mass * gravity))/1609.344
if velocity > 2380:
    print_slow("You escaped the moon's gravity. Goodbye!", print_speed)
    quit()
else:
    print("You reached", height, "miles and safely returned to the surface of the moon.")
again = input("Do you want to keep trying? 'yes' or 'no'? ")
if again == "yes":
    while velocity < 2380:
        fuel = eval(input("How many pounds of fuel should we burn?: "))
        fuel=fuel*10000
        mass = 1000
        gravity = 1.625
        velocity = math.sqrt(2*fuel/mass)
        height =  (fuel / (mass * gravity))/1609.344
        if height > 1000 and height < 1100:
            print("Congratulations, you have reached the maximum height. You have won.")
            quit()
        if velocity < 2380:
            print("You reached", height, "miles and safely returned to the surface of the moon.")
    else: print_slow("You escaped the moon's gravity. Goodbye!", print_speed)
    quit()
else: print_slow("Thanks for playing!", print_speed)
        
              


    




    
