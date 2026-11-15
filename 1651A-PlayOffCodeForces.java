import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int n;
        for(int i = 0; i < cases; i++){
            n = in.nextInt();
            int ans = (int) Math.pow(2, n) - 1;
            System.out.println(ans);
        }

        in.close();
    }
}