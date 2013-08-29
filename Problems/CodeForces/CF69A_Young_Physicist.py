## Young Physicist

def main():

    numVectors = int(raw_input())
    equilibrium = True
    current = [0,0,0]
    for i in range(numVectors):
        a,b,c = map(int,raw_input().split())
        current[0]+=a
        current[1]+=b
        current[2]+=c


    for x in current:
        if(x != 0):
            equilibrium = False
            break

    if(equilibrium == True):
        print("YES")
    else:
        print("NO")
            
        

main()
