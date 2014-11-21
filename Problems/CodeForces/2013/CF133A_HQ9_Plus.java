import java.io.PrintWriter;
import java.util.Scanner;


public class CF133A_HQ9_Plus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		String program = in.next();
		
		if(program.contains("H") || program.contains("Q") || program.contains("9")){
			out.println("YES");
		}else{
			out.println("NO");
		}
		
		in.close();
		out.flush();
		out.close();

	}

}
