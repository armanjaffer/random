import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AltChars {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        for (int i = 0; i < len; i++){
            System.out.println(altify(br.readLine()));
        }
    }
    public static int altify(String s){
        if (s.length() < 2){
            return 0;
        }
        char pc = s.charAt(0); int total = 0;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == pc){
                total++;
            }else{
                pc = s.charAt(i);
            }
        }
        return total;
    }
}