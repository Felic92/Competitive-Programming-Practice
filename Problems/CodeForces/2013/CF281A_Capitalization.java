import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class CF281A_Capitalization {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		char[] word = in.readLine().toCharArray();
		word[0] = Character.toUpperCase(word[0]);
		
		out.println(word);
		
		in.close();
		out.flush();
		out.close();

	}

}
