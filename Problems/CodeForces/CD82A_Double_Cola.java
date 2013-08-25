import java.io.PrintWriter;
import java.util.Scanner;

public class CF82A_Double_Cola {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		String[] people = { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };

		long n = in.nextInt();

		long p = 0;
		long s = (long) (5 * Math.pow(2, p));
		while (s < n) {
			n -= s;
			p++;
			if(s > n){
				break;
			}
			s = (long) (5 * Math.pow(2, p));
		}

		long eachPerson = (long) Math.pow(2, p);
		
		int idx = 0;
		while(n-eachPerson > 0){
			n-=eachPerson;
			idx++;
		}

		out.println(people[idx]);

		in.close();
		out.flush();
		out.close();

	}

}
