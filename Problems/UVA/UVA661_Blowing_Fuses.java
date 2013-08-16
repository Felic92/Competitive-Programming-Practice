import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class UVA661_Blowing_Fuses {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		String str = in.readLine();
		int caseNum = 0;
		
		while(!str.equals("0 0 0")){
			String [] data = str.split(" ");
			
			int n = Integer.parseInt(data[0]);
			int m = Integer.parseInt(data[1]);
			int c = Integer.parseInt(data[2]);
			caseNum++;
			
			int [] powerUse = new int[n];
			for(int i = 0; i < n; i++){
				powerUse[i] = Integer.parseInt(in.readLine());
			}
			
			int [] state = new int[n];
			int currentUse = 0;
			int maxUse = Integer.MIN_VALUE;
			boolean blewFuse = false;
			
			for(int j = 0; j < m; j++){
				int operate = Integer.parseInt(in.readLine());
				if(state[operate-1] == 0){
					state[operate-1] = 1;
					currentUse+=powerUse[operate-1];
					if(currentUse > c){
						blewFuse = true;
					}
				}else{
					state[operate-1] = 0;
					currentUse-=powerUse[operate-1];
				}
				
				if(currentUse > maxUse){
					maxUse = currentUse;
				}	
			}
			
			out.printf("Sequence %d\n", caseNum);
			if(blewFuse){
				out.println("Fuse was blown.");
			}else{
				out.println("Fuse was not blown.");
				out.printf("Maximal power consumption was %d amperes.\n",maxUse);		
			}
			out.println();
			
			str = in.readLine();
		}
		in.close();
		out.close();
	}
}
