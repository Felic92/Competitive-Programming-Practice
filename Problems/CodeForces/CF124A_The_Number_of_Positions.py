## CF 124A The number of positions

def main():
    n,a,b = map(int,raw_input().split())

    pos = n-a

    if(pos-1 > b):
        pos = b+1

    print pos

main()
