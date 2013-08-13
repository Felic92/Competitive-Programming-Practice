import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class UVA10300_Ecological_Premium {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cases = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < cases; i++){
			
			int farmers = Integer.parseInt(in.readLine());
			BigDecimal sol = BigDecimal.ZERO;
			BigDecimal total = BigDecimal.ZERO;
			
			for(int f = 0; f < farmers; f++){
				
				String [] data = in.readLine().split(" ");
				BigDecimal size = new BigDecimal(data[0]);
				BigDecimal animals = new BigDecimal(data[1]);
				BigDecimal friend = new BigDecimal(data[2]);
				try{
					total = size.divide(animals,5,RoundingMode.HALF_UP);
					
				}catch(Exception e){
					total = BigDecimal.ZERO;
				}
				
				total = total.multiply(friend);
				total = total.multiply(animals);
				
				sol = sol.add(total);
				sol = sol.setScale(2, RoundingMode.HALF_UP);
			}
			
			out.append(sol.intValue()+"\n");
		}
		in.close();
		out.close();

	}

}
