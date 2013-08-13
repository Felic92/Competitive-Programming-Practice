import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UVA11764_Jumping_Mario {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < cases; i++){
			int jumps = Integer.parseInt(in.readLine());
			String [] temp = in.readLine().split(" ");
			int [] j = new int[jumps];
			
			for(int a = 0; a<jumps; a++){
				j[a] = Integer.parseInt(temp[a]);
			}
			
			int hi = 0;
			int lo = 0;
			
			for(int k = 0; k < jumps-1; k++){
				try{
					if(j[k] < j[k+1]){
						hi+=1;
					}else if(j[k] > j[k+1]){
						lo+=1;
					}
					
				}catch(Exception e){
					//do nothing
				}
				
			}
			
			System.out.printf("Case %d: %d %d\n", i+1,hi,lo);
			
			
			
		}

	}

}
