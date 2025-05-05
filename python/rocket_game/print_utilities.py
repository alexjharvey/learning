import sys,time,random


def print_slow(text, speed):
    for letter in text:
        sys.stdout.write(letter)
        sys.stdout.flush()
        time.sleep(random.random()/speed)
    print('')


