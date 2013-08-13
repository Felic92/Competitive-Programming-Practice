#August Long 2013
#Little Elephant and Lemonaid
#http://www.codechef.com/AUG13/problems/HELLO

def main():

    cases = int(raw_input())

    for n in range(cases):
        dRate,Lmins,plans = raw_input().split()
        dRate = float(dRate)
        Lmins = float(Lmins)
        plans = int(plans)

        bestPlan = 0
        currCost = dRate * Lmins

        for i in range(1,plans+1):
            pData = raw_input().split()
            months = float(pData[0])
            nRate = float(pData[1])
            actCost = float(pData[2])

            sol = (Lmins*nRate)+(actCost/months)
            if(sol < currCost):
                bestPlan = i
                currCost = sol

        print bestPlan

main()
        
    
