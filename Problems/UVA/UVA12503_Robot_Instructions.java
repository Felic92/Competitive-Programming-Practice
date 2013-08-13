import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class UVA12503_Robot_Instructions 
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int cases = Integer.parseInt(in.readLine());
		String str;
		
		for(int i = 0; i < cases; i ++)
		{
			int position = 0;
			int commands = Integer.parseInt(in.readLine());
			String [] cStore = new String[105];
			for(int j = 0; j < commands;j++)
			{
				
				str = in.readLine();
				StringTokenizer st = new StringTokenizer(str," ");
				String pos =st.nextToken();
				if(pos.equals("LEFT"))
				{
					position-=1;
					cStore[j+1] = "LEFT";
				}
				else if(pos.equals("RIGHT"))
				{
					position+=1;
					cStore[j+1] = "RIGHT";
				}
				else if(pos.equals("SAME"))
				{
					st.nextToken();
					int c = Integer.parseInt(st.nextToken());
					cStore[j+1] = c+"";
					while(!cStore[c].equals("LEFT") && !cStore[c].equals("RIGHT"))
					{
						cStore[c] = cStore[Integer.parseInt(cStore[c])]; 
					}
					if(cStore[c].equals("LEFT"))
					{
						position-=1;
					}
					else
					{
						position+=1;
					}
				}

			}
			out.println(position);
			
		}
		in.close();
		out.close();

	}

}
