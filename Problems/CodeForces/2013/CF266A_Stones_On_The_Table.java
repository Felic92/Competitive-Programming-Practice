import java.io.PrintWriter;
import java.util.Scanner;

public class CF266A_Stones_On_The_Table {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int numStones = in.nextInt();
		int pairs = 0;
		char[] stones = in.next().toCharArray();
		for (int i = 0; i < numStones - 1; i++) {
			if (stones[i] == stones[i + 1]) {
				pairs++;
			}
		}

		out.println(pairs);

		in.close();
		out.flush();
		out.close();

	}

}
