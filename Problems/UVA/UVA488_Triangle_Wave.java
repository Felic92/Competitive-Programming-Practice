import java.io.PrintWriter;
import java.util.Scanner;


public class UVA488_Triangle_Wave {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int cases = in.nextInt();
		boolean first = true;
		
		for(int i = 0; i < cases; i++){
			
			if(first != true){out.println();}
			first = false;
			
			int amplitude = in.nextInt();
			int frequency = in.nextInt();
			
			String [] wave = new String[amplitude*2-1];
			
			for(int j = 1;j<amplitude+1;j++){
				wave[j-1] = new String(new char[j]).replace("\0", j+"");
			}
			
			int b = 2;
			for(int k = amplitude; k < amplitude*2-1; k++){
				wave[k] = wave[amplitude-b];
				b++;
				
			}
			
			
			for(int l = 0; l < frequency;l++){
				for(String a: wave){
					out.println(a);
				}
				if(l < frequency-1){
					out.println();
				}
			}

		}
		out.flush();
		in.close();
		out.close();

	}

}
