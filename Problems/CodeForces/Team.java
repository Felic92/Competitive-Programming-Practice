import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Team {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int problems = Integer.parseInt(in.readLine());
		int count = 0;
		
		for(int i = 0; i < problems; i++){
			int oneCount = in.readLine().replaceAll("[^1]", "").length();
			if(oneCount >=2){
				count++;
			}
		}
		
		out.println(count);
		
		in.close();
		out.flush();
		out.close();
	}

}
