## Ultra Fast Mathematician

def main():
    n1 = map(int,raw_input())
    n2 = map(int,raw_input())

    minVal = min(len(n1),len(n2))
    maxVal = max(len(n1),len(n2))
    num = ""

    diff = maxVal - minVal
    leadZeros = ""
    if( diff != 0):
        leadZeros = "0" * diff


    for j in range(minVal):
        if(n1[-1-j] == 1 and n2[-1-j] == 1):
            num+="0"
        elif(n1[-1-j] == 0 and n2[-1-j] == 1 or n1[-1-j] == 1 and n2[-1-j] == 0):
            num+="1"
        else:
            num+="0"


    print leadZeros + num[::-1]


main()

