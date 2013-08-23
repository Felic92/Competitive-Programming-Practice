import java.io.PrintWriter;
import java.util.Scanner;

public class CF97A_Football {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		char[] input = in.next().toCharArray();

		int oneCount = 0;
		int zeroCount = 0;
		boolean dangerous = false;
		for (char p : input) {
			if (p == '1') {
				oneCount++;
			} else {
				oneCount = 0;
			}

			if (p == '0') {
				zeroCount++;
			} else {
				zeroCount = 0;
			}

			if (oneCount == 7 || zeroCount == 7) {
				dangerous = true;
				break;
			}

		}

		if (dangerous) {
			out.println("YES");
		} else {
			out.println("NO");
		}

		in.close();
		out.flush();
		out.close();

	}

}
