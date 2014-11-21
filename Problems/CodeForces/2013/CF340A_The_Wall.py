## CF 340A The Wall

def main():
    x,y,a,b = map(int,raw_input().split())

    num = lcm(x,y)
    solution = b/num - (a-1)/num
    print solution

#Euclid's Algorithm
#Iterative
def gcd(x,y):
    while(y != 0):
        temp = y
        y = x % y
        x = temp
    return x

#Find LCM of 2 numbers
def lcm(x,y):
    return x*y/gcd(x,y)

main()
