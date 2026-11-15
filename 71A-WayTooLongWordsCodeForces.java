import java.util.*;


class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        in.nextLine();
        String word;
        for(int i = 0; i<times; i++){
            word = in.nextLine();
            if(word.length() <= 10)
                System.out.println(word);
            else{
                System.out.println(word.substring(0,1) + (word.length()- 2) + word.substring(word.length()-1));
            }
        }
        in.close();
    }
}
