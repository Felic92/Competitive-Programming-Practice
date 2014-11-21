import java.io.PrintWriter;
import java.util.Scanner;


public class CF282A_Bit_Plus_Plus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int operations = in.nextInt();
		int value = 0;
		
		for(int i = 0; i < operations; i++){
			String op = in.next();
			if(op.contains("+")){
				value++;
			}else{
				value--;
			}
			
		}
		
		out.println(value);
		
		in.close();
		out.flush();
		out.close();
		

	}

}
