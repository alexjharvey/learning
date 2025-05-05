from print_utilities import print_slow
import time, random

print_speed = 5
def countdown(count):
    for i in range(count, 0, -1):
        print(str(i))
        time.sleep(1)
    print("BLAST OFF!!!")