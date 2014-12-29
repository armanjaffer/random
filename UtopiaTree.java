import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopiaTree {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casesnum = Integer.parseInt(br.readLine());
        int height;
        for (int i = 0; i < casesnum; i++){
            height = utopify(Integer.parseInt(br.readLine()));
            System.out.println(height);
        }
        br.close();
    }
    public static int utopify(int n){
        if (n == 0){
                return 1;
        }else if (n % 2 == 0){
                return 1 + utopify(n-1);
        }else if (n % 2 == 1){
                return 2 * utopify(n-1);
        }else{
               return utopify(n-1); 
        }
            
     }
        
    
}