#include<stdio.h>

int main()
{
    int cases,cars,i,j,maxSpeed,temp;
    scanf("%d",&cases);

    for(i = 0; i < cases; i++)
    {
        int total = 1;
        scanf("%d",&cars);
        scanf("%d",&maxSpeed);
        for(j = 1; j < cars; j++)
        {
            scanf("%d",&temp);
            if(temp <= maxSpeed)
            {
                total+=1;
                maxSpeed = temp;
            }
        }

        printf("%d\n",total);
    }
    return 0;
}
