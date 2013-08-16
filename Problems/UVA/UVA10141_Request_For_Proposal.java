import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class UVA10141_Request_For_Proposal {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		String str = in.readLine();
		int caseNum = 0;
		boolean first = true;
		
		while(!str.equals("0 0")){
			String[]data = str.split(" ");
			int requirements = Integer.parseInt(data[0]);
			int proposals = Integer.parseInt(data[1]);
			
			if(first == false){out.println();}
			first = false;
			
			for(int i = 0; i <requirements;i++){
				in.readLine();
			}
			
			caseNum++;
			String bestProposal = "";
			int maxReqsMet = Integer.MIN_VALUE;
			double bestPrice = Integer.MIN_VALUE;
			
			for(int j = 0; j < proposals; j++){
				String name = in.readLine();
				String [] details = in.readLine().split(" ");
				double price = Double.parseDouble(details[0]);
				int metReqs = Integer.parseInt(details[1]);
				for(int k = 0; k < metReqs;k++){
					in.readLine();
				}
				
				if(metReqs > maxReqsMet || (metReqs == maxReqsMet && price < bestPrice)){
					bestProposal = name;
					bestPrice = price;
					maxReqsMet = metReqs;		
				}	
			}
			
			out.printf("RFP #%d\n", caseNum);
			out.println(bestProposal);
			
			str = in.readLine();
		}
		in.close();
		out.close();

	}

}
