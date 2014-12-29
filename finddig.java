import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        if (len < 1 || len > 15){
            throw new Exception("you bad boy");
        }
        for (int i = 0; i < len; i++){
            String line = br.readLine();
            if (line == null){
                continue;
            }
            long n = Long.parseLong(line);
            if (n < 0 || n > Math.pow(10, 10)){
                continue;
            }
            int toRtn = findDig(n, line.length());
            System.out.println(toRtn);
        }
        br.close();
    }
    public static int findDig(long n, long len){
        int total = 0; long k = (long) n;
        for (int i = 0; i < len; i++){
            long rem = k % 10;
            if (rem != 0){
                if (rem == 1 || n % rem == 0){
                    total++;
                }
            }
            k = k / 10;
        } return total;
    }
}