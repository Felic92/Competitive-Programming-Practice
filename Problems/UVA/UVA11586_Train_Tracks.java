import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class UVA11586_Train_Tracks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int cases = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < cases; i++){
			char[] data = in.readLine().toCharArray();
			
			int mCount= 0;
			int fCount = 0;
			for(char ch: data){
				if(ch == 'M'){
					mCount++;
				}else if(ch == 'F'){
					fCount++;
				}
			}
			
			if(mCount > 1 && mCount == fCount){
				out.println("LOOP");
			}else{
				out.println("NO LOOP");
			}
		}
		in.close();
		out.close();
	}

}
