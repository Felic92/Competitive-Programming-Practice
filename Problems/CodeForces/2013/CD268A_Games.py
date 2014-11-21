##Games

def main():
    numGames = int(raw_input())
    
    home = []
    away = []
    total = 0
    for i in range(numGames):
        a,b = map(int,raw_input().split())
        home.append(a)
        away.append(b)

    for t in home:
        total+=away.count(t)

    print total

main()
