import java.io.PrintWriter;
import java.util.Scanner;


public class UVA10324_Zeros_And_Ones2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		String next;
		int c = 0;
		
		while(in.hasNext() && !((next = in.next()).equals("\n"))){
			c++;
			out.printf("Case %d:\n",c);
			char[] number = next.toCharArray();
			int [] lastChange = new int[number.length];
			
			char curr = number[0];
			int idx = 0;
			for(int j = 0; j < number.length; j++){
				if(number[j] != curr){
					curr = number[j];
					idx = j;
					lastChange[j] = idx;
				}else{
					lastChange[j] = idx;
				}
			}
			
			int queries = in.nextInt();
			for(int i = 0; i < queries; i++){
				int begin = in.nextInt();
				int end = in.nextInt();
				
				if(lastChange[begin] == lastChange[end]){
					out.println("Yes");
				}else{
					out.println("No");
				}
			}	
		}
		in.close();
		out.close();
	}

}
