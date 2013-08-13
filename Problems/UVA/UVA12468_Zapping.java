import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class UVA12468_Zapping
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		String str = in.readLine().trim();
		
		while(!str.equals("-1 -1"))
		{
			StringTokenizer st = new StringTokenizer(str," ");

			int c1 = Integer.parseInt(st.nextToken())+1;
			int c2 = Integer.parseInt(st.nextToken())+1;
			
			int option1 = Math.abs(c1-c2);
			int option2;
			if(c1 <= c2){
				option2 = Math.abs((100+c1) - c2);
			}else{
				option2 = Math.abs(c1 - (100+c2));
			}
			
			if(option1 <= option2)
			{
				out.println(option1);
			}else{
				out.println(option2);
			}
			
			
			str = in.readLine();
			
		}
		in.close();
		out.close();

	}

}
