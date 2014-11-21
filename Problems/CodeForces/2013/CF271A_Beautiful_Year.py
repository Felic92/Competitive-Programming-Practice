##Beautiul Year

def main():
    year = raw_input()
    y = set(year.split())
    year = int(year)

    while(y != 4):
        year+=1
        y = len(set(list(str(year))))
        
    print year
        
    

main()
