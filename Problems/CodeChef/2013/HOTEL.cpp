//Code Chef
//Hotel Bytelandia
//http://www.codechef.com/problems/HOTEL


#include<stdio.h>

int main()
{
    int tc,guests,i,j,k;



    scanf("%d",&tc);

    while(tc--)
    {
        int simulate [1005] = {0};
        int a,d;
        scanf("%d",&guests);

        for(i = 0; i < guests; i++)
        {
            scanf("%d",&a);
            simulate[a]+=1;
        }

        for(j = 0; j < guests; j++)
        {
            scanf("%d",&d);
            simulate[d]-=1;
        }

        int max = 0;
        int current = 0;
        for(k=1;k<1001;k++)
        {
            current += simulate[k];
            if(current > max)
            {
                max = current;
            }
        }

        printf("%d\n",max);

    }

    return 0;
}
