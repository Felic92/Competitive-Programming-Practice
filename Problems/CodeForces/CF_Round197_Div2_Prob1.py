##

def main():
    data = map(int,raw_input().split("+"))

    data = sorted(data)

    final = ""
    
    for i in range(len(data)):
        if(i < len(data)-1):
            final+=(str(data[i])+"+")
        else:
            final+=str(data[i])
        

    print final
        


main()
