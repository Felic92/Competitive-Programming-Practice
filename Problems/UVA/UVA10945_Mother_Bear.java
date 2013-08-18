import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class UVA10945_Mother_Bear {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		String data = in.readLine();
		
		while(!data.equals("DONE")){
			
			data = data.replaceAll("\\W", "").toLowerCase();
			String reversed = new StringBuffer().append(data).reverse().toString();
			
			if(data.equals(reversed)){
				out.println("You won't be eaten!");
			}else{
				out.println("Uh oh..");
			}
			
			data = in.readLine();
		}
		in.close();
		out.close();

	}

}
