import java.io.PrintWriter;
import java.util.Scanner;

public class Taxi3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		//all elements counts increment as input comes in
		
		
		//while(in.hasNext()){
		for(int t=0;t < 1;t++){
			int oneCount = 0;
			int twoCount = 0;
			int threeCount = 0;
			int fourCount = 0;
			
			int groupNum = in.nextInt();
			for(int i = 0; i < groupNum; i++){
				int n = in.nextInt();
				if(n == 1){oneCount++;}
				else if(n == 2){twoCount++;}
				else if(n == 3){threeCount++;}
				else if(n == 4){fourCount++;}
			}
			
//			out.println(oneCount);
//			out.println(twoCount);
//			out.println(threeCount);
//			out.println(fourCount);

			
			int taxis = fourCount;
			
			taxis += (twoCount*2 /4);
			twoCount -= ((twoCount*2)/4)*2;
			
			while(threeCount > 0 && oneCount >0){
				taxis+=1;
				oneCount -=1;
				threeCount -=1;
			}
			taxis+=threeCount;
			
			while(twoCount > 0 && oneCount >1){
				taxis+=1;
				oneCount-=2;
				twoCount-=1;
			}
			
			
			taxis += (oneCount/4);
			oneCount-=(oneCount/4)*4;
			
			if(oneCount > 0 || twoCount > 0){
				taxis+=1;
			}
			
			out.println(taxis);
			
		}
		in.close();
		out.flush();
		out.close();

	}

}
