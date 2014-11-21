##Queue at the school
import re


def main():
    people,time = map(int,raw_input().split())
    seq = raw_input()
    
    for i in range(time):
        seq = re.sub("BG","GB",seq)

    print seq
        
main()
