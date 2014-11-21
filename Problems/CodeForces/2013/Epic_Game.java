import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Epic_Game {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String[] input = in.readLine().split(" ");

		int simon = Integer.parseInt(input[0]);
		int antisimon = Integer.parseInt(input[1]);
		int stones = Integer.parseInt(input[2]);

		boolean notEnded = true;

		while (notEnded) {

			int simVal = gcd(simon, stones);
			if (simVal <= stones) {
				stones -= simVal;
				if (stones == 0) {
					out.println("0");
					notEnded = false;
				}
			} else {
				out.println("1");
				notEnded = false;
			}

			if (notEnded) {
				int antiVal = gcd(antisimon, stones);
				if (antiVal <= stones) {
					stones -= gcd(antisimon, stones);
					if (stones == 0) {
						out.println("1");
						notEnded = false;
					}
				} else {
					out.println("0");
					notEnded = false;
				}

			}

		}

		in.close();
		out.flush();
		out.close();

	}

	private static int gcd(int a, int b) {
		int GCD = 0;

		while (b != 0) {
			GCD = b;
			b = a % b;
			a = GCD;
		}
		return GCD;

	}
}
