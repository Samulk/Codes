import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int sum_primary = 0;
        int sum_cross  = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                
                if(a_i == a_j) {
                    sum_primary += a[a_i][a_j];
                }
                
                if((a_i + a_j) == (n - 1)) {
                    sum_cross += a[a_i][a_j];
                }
            }
        }
        
        System.out.println(Math.abs(sum_primary - sum_cross));
    }
}
