import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class maxXOR {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
        int max = 0; int newMax;
        for (int i = l; i < r + 1; i++){
            for (int k = l; k < r + 1; k++){
                max = Math.max(max, i^k);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}