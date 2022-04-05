import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(rat(arr, x, y, n));
    }
    private static int rat(int []arr, int x, int y, int n){
        if(arr == null)
            return -1;
        int sum =0;
        int count = 0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
            count++;
            if(sum >= (x*y))
                break;
        }
        if(sum < (x*y))
            return 0;
        return count;
    }
}
