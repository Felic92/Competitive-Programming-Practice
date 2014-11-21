import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class CF160A_Twins {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int numCoins = in.nextInt();
		int [] coins = new int[numCoins];
		
		int total = 0;
		
		for(int i = 0; i < numCoins; i++){
			coins[i] = in.nextInt();
			total+=coins[i];
		}
		
		Arrays.sort(coins);
		
		int minCoins = 0;
		int value = 0;
		
		for(int j = numCoins-1; j > -1;j--){
			minCoins++;
			value+=coins[j];
			total-=coins[j];
			if(value > total){
				break;
			}
		}
		
		out.println(minCoins);
		
		in.close();
		out.flush();
		out.close();

	}

}
