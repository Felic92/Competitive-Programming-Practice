import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;


public class UVA10424_Love_Calculator {
	
	static HashMap<Character,Integer> mappings = new HashMap<Character,Integer>();
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		mappings.put('A', 1); mappings.put('B', 2); mappings.put('C', 3);
		mappings.put('D', 4); mappings.put('E', 5); mappings.put('F', 6);
		mappings.put('G', 7); mappings.put('H', 8); mappings.put('I', 9);
		mappings.put('J', 10); mappings.put('K', 11); mappings.put('L', 12);
		mappings.put('M', 13); mappings.put('N', 14); mappings.put('O', 15);
		mappings.put('P', 16); mappings.put('Q', 17); mappings.put('R', 18);
		mappings.put('S', 19); mappings.put('T', 20); mappings.put('U', 21);
		mappings.put('V', 22); mappings.put('W', 23); mappings.put('X', 24);
		mappings.put('Y', 25); mappings.put('Z', 26);
		
	    DecimalFormat df = new DecimalFormat();
	    df.setMinimumFractionDigits(2);
	    df.setMaximumFractionDigits(2);
		
		while(in.hasNextLine()){
			
			String first = in.nextLine().toUpperCase();
			String second = in.nextLine().toUpperCase();
			double firstScore = digitSum(nameScore(first));
			double secondScore = digitSum(nameScore(second));
			
		    double ratio;
		    if(firstScore < secondScore){
		    	ratio = firstScore / secondScore;
		    }else{
		    	ratio = secondScore / firstScore;
		    }
		    
		    ratio*=100;
		    
		    out.println(df.format(ratio) +" %");
				
		}
		in.close();
		out.close();
	}
	
	private static int nameScore(String name) {	
		int s = 0;
		for (char letter : name.toCharArray()) {
			if (mappings.containsKey(letter)) {
				s += mappings.get(letter);
			}
		}	
		return s;
	}
	
	private static int digitSum(int number){
		int sum = number % 9;
	    if( sum == 0 ){
	    	sum = 9;
	    }
	    return sum; 	
	}
}
