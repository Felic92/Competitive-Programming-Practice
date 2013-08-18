##Code Forces Practice
##Watermelon
##Implementation

def main():

    n,k = map(int,raw_input().split())

    scores = map(int,raw_input().split())
    
    advance = 0
    
    for s in scores:
        if(s >= scores[k-1] and s > 0):
            advance+=1
        else:
            break

    print advance

main()
