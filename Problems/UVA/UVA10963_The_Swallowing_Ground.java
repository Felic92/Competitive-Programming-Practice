import java.io.IOException;
import java.util.Scanner;


public class UVA10963_The_Swallowing_Ground {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner in = new Scanner(System.in);
		
		int cases = in.nextInt();
		
		for(int i = 0; i < cases;i++){
			boolean possible = true;
			int R = in.nextInt();
			int last = Math.abs((in.nextInt()-in.nextInt()));
			for(int j = 1; j < R; j++){
				int current = Math.abs(in.nextInt()-in.nextInt());
				if(current != last){
					possible = false;
				}
				
			}
			if(possible == true){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
			
			if(i < cases-1){
				System.out.println();
			}
			
		}
		in.close();
	}

}