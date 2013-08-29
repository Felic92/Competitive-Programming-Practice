

def main():
     h,t = map(int,raw_input().split())
     data = map(int,raw_input().split())

     time = 0
     curr = 1

     for val in data:
         if(val > curr):
             #print val ," > ", curr
             time += abs(val-curr)
             curr = val
             #print time
         elif(val == curr):
            #print val ,"==", curr
            continue
            #print time
         else:
            #print val ,"<",curr
            time+=((h-curr)+1)
            curr = 1
            time+=abs(val-curr)
            curr = val
            #print time

     print time

main()
