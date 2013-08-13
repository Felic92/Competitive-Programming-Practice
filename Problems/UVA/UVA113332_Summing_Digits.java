import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVA113332_Summing_Digits {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String data = in.readLine();

		while (!data.equals("0")) {
			int num = Integer.parseInt(data);
			int sol = num%9;
			if(sol == 0){
				System.out.println(9);
			}
			else{
				System.out.println(sol);
			}
			data = in.readLine();
		}

	}

}

// =======ITERATIVE SOLUTION=======
// while(!data.equals("0")){
//
// boolean repeat = false;
// int current = 0;
// while(repeat != true){
// int previous= Integer.parseInt(data);
// current = 0;
// char[] temp = data.toCharArray();
// for(char a: temp){
// current += Character.getNumericValue(a);
// }
// if(current == previous){
// repeat = true;
// }else{
// data = ""+current;
// }
//
//
//
// }
// System.out.println(current);
//
// data = in.readLine();
// }

// =========Attempted Recursive============

// private static int sumDigits(int i) {
// if(i+"".length() == 2){
// return i;
// }
// int sum= 0;
//
// while (i > 0) {
// sum+=i%10;
// i/=10;
// }
// return sumDigits(sum);
// }

// public static void main(String[] args) throws NumberFormatException,
// IOException {
// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//
// String data = in.readLine();
// int sol;
//
// while (!data.equals("0")) {
// sol = sumDigits(Integer.parseInt(data));
// System.out.println(sol);
// data = in.readLine();
// }
//
// }
