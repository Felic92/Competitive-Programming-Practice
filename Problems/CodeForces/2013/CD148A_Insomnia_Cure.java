import java.io.PrintWriter;
import java.util.Scanner;

public class CD148A_Insomnia_Cure {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int k = in.nextInt();
		int l = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int d = in.nextInt();

		boolean done = false;
		if (k == 1 || l == 1 || m == 1 || n == 1) {
			done = true;
		}
		int count = 0;

		if (done == true) {
			count = d;
		} else {
			boolean[] hurtDragons = new boolean[100005];

			for (int i = 1; i <= d; i++) {
				if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
					if (hurtDragons[i] == false) {
						count++;
					}
					hurtDragons[i] = true;
				}
			}

		}

		out.println(count);

		in.close();
		out.flush();
		out.close();

	}

}
