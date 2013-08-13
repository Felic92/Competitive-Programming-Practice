import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class UVA11679_Sub_Prime 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		
		String str = in.readLine().trim();
		
		while(!str.equals("0 0"))
		{
			StringTokenizer st = new StringTokenizer(str," ");
			int B = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int [] reserves = new int[B];
			str = in.readLine();
			st = new StringTokenizer(str," ");
			
			for(int i = 0; i < B; i++)
			{	// base reserves to be adjusted
				reserves[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int j = 0; j < N; j++)
			{	// values to use as adjustments
				str = in.readLine();
				st = new StringTokenizer(str," ");
				int D = Integer.parseInt(st.nextToken());
				int C = Integer.parseInt(st.nextToken());
				int V = Integer.parseInt(st.nextToken());
				reserves[D-1]-=V;
				reserves[C-1]+=V;
				
			}
			
			boolean allesGut = true;
			for(int bank: reserves)
			{
				if(bank < 0)
				{
					allesGut = false;
					break;
				}
				
			}
			
			if(allesGut == true)
			{
				out.println("S");
			}
			else
			{
				out.println("N");
			}
			
			str = in.readLine().trim();
		}
		in.close();
		out.close();

	}

}
