import java.io.PrintWriter;
import java.util.Scanner;


public class Domino_Pile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		while(in.hasNext()){
			int M = in.nextInt();
			int N = in.nextInt();
			
			int space = (M * N)/2;
			
			out.println(space);

		}
		in.close();
		out.flush();
		out.close();

	}

}
