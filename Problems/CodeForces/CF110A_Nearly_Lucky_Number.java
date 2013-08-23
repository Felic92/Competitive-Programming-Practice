import java.io.PrintWriter;
import java.util.Scanner;


public class CF110A_Nearly_Lucky_Number{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        String data = in.next();
        int luckyCount = data.replaceAll("[^4^7]", "").length();
        
        if(luckyCount == 4 || luckyCount == 7){
            out.println("YES");
        }else{
            out.println("NO");
        }
        
        in.close();
        out.flush();
        out.close();

    }

}