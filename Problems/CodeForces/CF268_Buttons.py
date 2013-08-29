##Buttons

def main():
    b = int(raw_input())   
    pushes = b
    
    for i in range(b):
        pushes+= ((b-i)*i)
        
    print pushes

main()
