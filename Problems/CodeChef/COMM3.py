#Code Chef
#Three Way Communication
#http://www.codechef.com/problems/COMM3

from math import sqrt

def main():

    cases = int(raw_input())
    
    for i in range(cases):
        maxDistance = int(raw_input())
        chef1 = map(int,raw_input().split())
        chef2 = map(int,raw_input().split())
        chef3 = map(int,raw_input().split())

        OnetoTwo = sqrt((chef2[0] - chef1[0])**2 + (chef2[1] - chef1[1])**2)
        OnetoThree = sqrt((chef3[0] - chef1[0])**2 + (chef3[1] - chef1[1])**2)
        TwotoThree = sqrt((chef3[0] - chef2[0])**2 + (chef3[1] - chef2[1])**2)
                          
        if(OnetoTwo > maxDistance):
            if(OnetoThree > maxDistance):
                print "no"
            else:
                if(TwotoThree <= maxDistance):
                    print "yes"
                else:
                    print "no"         
        else:
            if(OnetoThree <= maxDistance):
                print "yes"
            else:
                if(TwotoThree <= maxDistance):
                    print "yes"
                else:
                    print "no"

main()
