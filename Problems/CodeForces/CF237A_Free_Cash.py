## Free Cash

def main():
    customers = int(raw_input())

    prev = raw_input()
    mCount = 1
    temp = 1
    for i in range(customers-1):
        curr = raw_input()
        if(curr == prev):
            temp +=1
        else:
            temp = 1
            prev = curr

        if(temp > mCount):
            mCount = temp
        
    print mCount
        

    
main()
