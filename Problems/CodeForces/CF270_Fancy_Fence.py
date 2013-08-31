#CF 270 Fancy Fence

def main():

    cases = int(raw_input())

    for i in range(cases):
        a = int(raw_input())
        if(360 % (180-a) == 0):
            print "YES"
        else:
            print "NO"
main()
