import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//What if the number you start with is already a palindrome? Ignore and carry out rev and add?

public class UVA10018_Reverse_And_Add {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int cases = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < cases; i++){
			int iterations = 0;
			
			String data = in.readLine();
			
			while(!isPalindrome(data)){
				iterations++;
				long original = Integer.parseInt(data);
				long reverse = Integer.parseInt(new StringBuffer().append(data).reverse().toString());
				
				data = original + reverse+"";
			}
			
			out.printf("%d %s\n",iterations,data);
			
		}
		in.close();
		out.close();

	}
	
	public static boolean isPalindrome(String data){
		return data.equals(new StringBuffer().append(data).reverse().toString());
	}

}
