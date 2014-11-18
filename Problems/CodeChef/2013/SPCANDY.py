#August Long 2013
#Splitting Candies
#http://www.codechef.com/AUG13/problems/SPCANDY/

cases = int(raw_input())

for i in range(cases):
    
    n,k = map(int,raw_input().split())

    if(n == 0):
        stud = 0
        rem = 0
    elif(k == 0):
        stud = 0
        rem = n
    else:
        stud = n//k
        rem = n%k
        
    print str(stud)+" "+ str(rem)

    
