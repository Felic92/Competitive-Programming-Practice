import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class UVA12157_Tariff_Plan {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int cases = Integer.parseInt(in.readLine());
		String str;
		
		for(int i = 0; i < cases; i++)
		{
			int calls = Integer.parseInt(in.readLine());
			str = in.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			int juice = 0;
			int mile = 0;
			
			for(int j = 0; j < calls; j++)
			{
				//tokenize and calculate in this loop
				int call = Integer.parseInt(st.nextToken())+1;
				mile+=((call/30)*10);
				if(call%30 != 0){
					mile+=10;
				}
				juice+=((call/60)*15);
				if(call%60!=0){
					juice+=15;
				}
			}
			if(mile < juice)
			{
				out.printf("Case %d: Mile %d\n",i+1,mile);
			}else if(mile > juice)
			{
				out.printf("Case %d: Juice %d\n",i+1,juice);
			}else{
				out.printf("Case %d: Mile Juice %d\n",i+1,juice);
			}
		}
		in.close();
		out.close();

	}

}
