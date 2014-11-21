import java.io.PrintWriter;
import java.util.Scanner;

public class CF114A_Arrival_Of_The_General {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int numSoldiers = in.nextInt();
		int[] soldiers = new int[numSoldiers];

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int minIdx = 0;
		int maxIdx = 0;

		for (int i = 0; i < numSoldiers; i++) {
			soldiers[i] = in.nextInt();
			if (soldiers[i] <= min) {
				min = soldiers[i];
				minIdx = i;
			}
			if (soldiers[i] > max) {
				max = soldiers[i];
				maxIdx = i;
			}
		}
		
		int minMoves = 0;

		if (soldiers[0] != max) {
			if (maxIdx > minIdx) {
				minIdx += 1;
			}
			while(maxIdx != 0){
				minMoves++;
				maxIdx--;
			}
		}
		
		if (soldiers[numSoldiers-1] != min) {
			while(minIdx != numSoldiers-1){
				minMoves++;
				minIdx++;
			}
		}

		out.println(minMoves);

		in.close();
		out.flush();
		out.close();

	}

}
