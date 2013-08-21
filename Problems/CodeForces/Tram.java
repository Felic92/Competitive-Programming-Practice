import java.io.PrintWriter;
import java.util.Scanner;


public class Tram {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int stops = in.nextInt();
		int max = Integer.MIN_VALUE;
		int current = 0;
		
		for(int i = 0; i < stops; i++){
			int off = in.nextInt();
			int on = in.nextInt();
			
			current-=off;
			current+=on;
			
			if(current > max){
				max = current;
			}
			
		}
		
		out.println(max);
		
		in.close();
		out.flush();
		out.close();

	}

}
