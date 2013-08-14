import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class UVA119_Greedy_Gift_Givers {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		boolean newline = true;
		while(in.hasNextInt()){
			if(!newline){
				out.println();
			}
			 
			int groupSize = in.nextInt();
			String[] names = new String[groupSize];
			HashMap<String, Integer> netWorth = new HashMap<String, Integer>();

			for (int i = 0; i < groupSize; i++) {
				names[i] = in.next();
				netWorth.put(names[i], 0);
			}

			for (int j = 0; j < groupSize; j++) {
				String name = in.next();
				int gift = in.nextInt();
				int friends = in.nextInt();
				
				if(friends > 0){
					
					int equalDiv = gift / friends;

					netWorth.put(name, netWorth.get(name) - gift);
					
			        if (gift != 0 && gift % friends != 0) {
			        	int rem = gift % friends;
			        	netWorth.put(name, netWorth.get(name) + rem);
			            gift -= rem;
			        }

					for (int k = 0; k < friends; k++) {
						String f1 = in.next();
						netWorth.put(f1, netWorth.get(f1) + equalDiv);
					}
				}
			}

			for (String n : names) {
				out.printf("%s %d\n", n, netWorth.get(n));
			}
			newline = false;
		}
		in.close();
		out.close();

	}

}
