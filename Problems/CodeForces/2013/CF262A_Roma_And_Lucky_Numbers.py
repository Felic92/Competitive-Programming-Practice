##Roma and Lucky Number

def main():

    n,upper = map(int,raw_input().split())
    nums = map(int,raw_input().split())

    total = 0 
    for n in nums:
        sol = luckyNumberCount(n,0)
        if(sol <= upper):
            total+=1

    print total


def luckyNumberCount(num,count):
    if( num < 10 ):
        if(num == 4 or num == 7):
            count+=1
        return count
    
    x = num%10
    if( x == 4 or x == 7):
        count +=1

    return luckyNumberCount(num/10,count)
    
    


main()

