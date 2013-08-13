#August Long 2013
#Little Elephant and Lemonaid
#http://www.codechef.com/AUG13/problems/LELEMON/

def main():
    
    cases = int(raw_input())
    
    for i in range(cases):
        
        n,m = map(int,raw_input().split())
        visitOrder = map(int,raw_input().split())
        total = 0
        d = {}
        
        for j in range(n):
            l = map(int,raw_input().split())[1:]
            l = sorted(l)
            d.update({j:l})

        for k in visitOrder:
            if(d[k] != []):
                total+= d[k][-1]
                d[k] = d[k][:-1]
                
        print total
                  
main()
