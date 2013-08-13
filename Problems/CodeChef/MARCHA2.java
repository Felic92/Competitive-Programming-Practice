
/**
 * My first solution in Python yielded TLE the same solution in Java yielded AC
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MARCHA2 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String str;

		int cases = Integer.parseInt(in.readLine());

		for (int i = 0; i < cases; i++) {

			int levels = Integer.parseInt(in.readLine());
			int[] leaves = new int[levels];

			str = in.readLine();

			StringTokenizer st = new StringTokenizer(str, " ");

			for (int j = 0; j < levels; j++) {
				leaves[j] = Integer.parseInt(st.nextToken());
			}

			int stems = 1;
			boolean valid = true;

			for (int k = 0; k < levels; k++) {
				stems -= leaves[k];

				if (stems <= 0 && k != levels - 1) {
					valid = false;
					break;
				}

				stems *= 2;
			}

			if (stems == 0 && valid == true) {
				out.println("Yes");
			} else {
				out.println("No");
			}
		}
		in.close();
		out.close();

	}

}
