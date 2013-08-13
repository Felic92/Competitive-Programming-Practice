import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class UVA10215_Google_Is_Feeling_Lucky
{
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int cases = Integer.parseInt(in.readLine());
		String str;
		
		for(int i = 0; i < cases; i++ )
		{
			ArrayList<String> urls = new ArrayList<String>();
			int maxVal = Integer.MIN_VALUE;
			//for each case read 10 lines
			for(int j = 0; j < 10; j++)
			{
				str = in.readLine();
				StringTokenizer st = new StringTokenizer(str," ");
				String url = st.nextToken();
				int relVal = Integer.parseInt(st.nextToken());
				
				if(relVal == maxVal){
					urls.add(url);
				}
				else if(relVal > maxVal)
				{
					maxVal = relVal;
					urls.clear();
					urls.add(url);
				}
			}
			out.printf("Case #%d:\n", i+1);
			for(String e:urls){
				out.println(e);
			}
		}
		in.close();
		out.close();

	}

}
