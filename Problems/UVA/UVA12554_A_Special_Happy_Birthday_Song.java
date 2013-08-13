import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class UVA12554_A_Special_Happy_Birthday_Song 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		//only one test case
		String [] song  = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you".split(" ");
		
		int people = Integer.parseInt(in.readLine());
		String[] names = new String[people];
		
		for(int i = 0; i < people;i++)
		{
			names[i] = in.readLine();	
		}
		
		sing(0,0,song,names);
		
		in.close();

	}
	
	public static void sing(int nPos,int sPos, String []song, String[]names)
	{
		
		PrintWriter out = new PrintWriter(System.out);
		boolean special = false;
		
		while(sPos != (song.length) || special != true)
		{
			if(nPos == (names.length))
			{
				special = true;
				nPos = 0;
			}
			else if(sPos == (song.length)) 
			{
				sPos = 0;
			}
			
			out.printf("%s: %s\n",names[nPos],song[sPos]);
			nPos+=1;
			sPos+=1;
			
		}
		out.close();
		
		
	}

}
