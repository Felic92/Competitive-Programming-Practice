import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class UVA11942_Lumberjack_Sequencing 
{
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		
		int cases = Integer.parseInt(in.readLine());
		String str;
		
		out.println("Lumberjacks:");
		
		for(int i = 0 ; i < cases; i++)
		{
			boolean reverse = false;
			boolean ordered = true;
			str = in.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			int p1 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());
			
			if(p1-p2 > 0 )
			{ //negative value means reverse is true
				reverse = true; //default true handles all equal case
			}
			
			for(int j = 2; j < 10; j++)
			{
				p1 = p2;
				p2 = Integer.parseInt(st.nextToken());
				if(reverse == false && (p1-p2 > 0))
				{
					ordered = false;
					break; //out to main case loop
				}
				if(reverse == true && (p1-p2 < 0))
				{
					ordered=false;
					break;
				}
				
			}
			
			if(ordered == true)
			{
				out.println("Ordered");
			}
			else
			{
				out.println("Unordered");
			}
		
		}
		in.close();
		out.close();

	}

}
