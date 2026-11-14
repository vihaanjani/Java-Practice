import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        if(w%2 != 0 || w == 2)
            System.out.println("NO");
        else
            System.out.println("YES");
        in.close();
    }
}
