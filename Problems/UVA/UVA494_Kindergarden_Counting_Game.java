import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class UVA494_Kindergarden_Counting_Game {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		String str = in.readLine();
		
		//while(str != null){
		for(int x = 0; x < 4;x++){
			String[] data = str.split("\\P{L}+"); //splits on anything which is not a letter
			
			int wordCount = 0;
			for(String w:data){
				boolean word = false;
				for(int i = 0; i < w.length();i++){
					if(Character.isLetter(w.charAt(i))){
						word = true;
						break;
					}
				}
				if(word == true){
					wordCount++;
				}
			}
			
			out.println(wordCount);
			
			str = in.readLine();
		}
		in.close();
		out.close();
	}
}
