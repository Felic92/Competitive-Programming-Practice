## Circle Line Attempt#2

def main():

    stations = int(raw_input())
    distances = map(int,raw_input().split())
    start,finish = map(int,raw_input().split())

    if(start > finish):
        start,finish = finish,start

    f = abs(start-finish)
    b = abs(stations - f)

    fSum = 0
    bSum = 0
    for i in range(f):
        idx = (start-1)+i
        if(idx > stations -1):
            idx = 0
        fSum+=distances[idx]

    for j in range(b):
        idx = (start-1)-j
        bSum+=distances[idx-1]
        
    print min(fSum,bSum)

main()
