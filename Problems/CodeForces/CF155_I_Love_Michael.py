## A. I_Love_%username%


def main():
    contests = int(raw_input())

    scores = map(int,raw_input().split())

    best= scores[0]
    worst = scores[0]
    amazing = 0

    for i in range(len(scores)):
        if(scores[i] < worst):
            amazing+=1
            worst = scores[i]
        if(scores[i]> best):
            amazing+=1
            best=scores[i]

    print amazing


main()
