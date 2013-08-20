import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class String_Task {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('A'); vowels.add('a'); vowels.add('O'); vowels.add('o');
		vowels.add('Y'); vowels.add('y'); vowels.add('E'); vowels.add('e');
		vowels.add('I'); vowels.add('i'); vowels.add('U'); vowels.add('u');
		
		//while(in.hasNextLine()){
		for(int i = 0; i < 1;i++){
			StringBuffer outputStr = new StringBuffer();
			
			char[] data = in.nextLine().toCharArray();
			
			for(char a: data){
				if(!vowels.contains(a) && a != ' '){
					outputStr.append(".");
					if(Character.isUpperCase(a)){
						outputStr.append(Character.toLowerCase(a));
					}
					else{
						outputStr.append(a);
					}
				}
			}
			out.println(outputStr);
		}
		out.flush();
		in.close();
		out.close();		
	}
}
