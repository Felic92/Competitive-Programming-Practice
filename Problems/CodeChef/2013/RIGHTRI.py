import math

def main():
        
    cases = int(raw_input())
    triangles = 0

    for i in range(cases):
        
        x1,y1,x2,y2,x3,y3 = map(int,raw_input().split())
        p1 = tuple([x1,y1])
        p2 = tuple([x2,y2])
        p3 = tuple([x3,y3])

        d1 = distance(p1,p2)
        d2 = distance(p2,p3)
        d3 = distance(p1,p3)
        dl = [d1,d2,d3]

        dlMax = max(dl)
        dl.remove(dlMax)
        
        s = 0
        for point in dl:
            s+= point**2

        if(int(s - (dlMax**2)) == 0 ):
            triangles+=1

    print triangles
        

        
def distance(p0, p1):
    return math.sqrt((p0[0] - p1[0])**2 + (p0[1] - p1[1])**2)
        
main()
