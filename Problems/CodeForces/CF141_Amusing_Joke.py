## Amusing Joke


def main():
    L1 = raw_input()
    L2 = raw_input()
    combination = L1+L2
    combination = sorted(combination)
    pile = sorted(raw_input())

    possible = True

    if(len(combination) != len(pile)):
        possible = False
    else:
        for i in range(len(pile)):
            if(combination[i] != pile[i]):
                possible = False
                break

    if(possible == True):
        print "YES"
    else:
        print "NO"

    

main()
