##Code Forces Practice
##Theatre Square
## Greedy Math

from __future__ import division

def main():
    n,m,a = map(int,raw_input().split())

    stones = 0

    stones+= n//a
    if(n%a != 0):
        stones+=1

    if(m > a):
        col = (m-a)/a
        if(m % a == 0):
            stones += col * stones
        else:
            stones += (int(col)+1) * stones
            
    print int(stones)

main()
    
