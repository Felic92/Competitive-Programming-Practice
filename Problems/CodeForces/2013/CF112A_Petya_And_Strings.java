import java.io.PrintWriter;
import java.util.Scanner;


public class CF112A_Petya_And_Strings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		String s1 = in.next();
		String s2 = in.next();
		
		int result = s1.compareToIgnoreCase(s2);
		
		if(result < 0){
			out.println("-1");
		}else if(result > 0){
			out.println("1");		
		}else{
			out.println("0");
		}
		
		in.close();
		out.flush();
		out.close();

	}

}
