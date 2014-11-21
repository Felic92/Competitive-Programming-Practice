## Chat Room 58A

def main():
    
    word = raw_input()
    s = ["h","e","l","l","o"]
    
    idx = 0

    for x in word:
        if(idx == 5):
            break
        if(x == s[idx]):
            idx+=1
            continue

    if(idx == 5):
        print "YES"
    else:
        print "NO"
    
main()



    
