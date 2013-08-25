import java.io.PrintWriter;
import java.util.Scanner;

public class CF122A_Lucky_Division {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int data = in.nextInt();

		int[] luckyNums = { 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747,774, 777 };

		boolean good = false;
		
		for (int num : luckyNums) {
			if ((double)data % num == 0) {
				good = true;
				break;
			}
			if(num > data ){
				break;
			}
		}

		if (good == true) {
			out.println("YES");
		} else {
			out.println("NO");

		}
		
		in.close();
		out.flush();
		out.close();
		

	}

}
