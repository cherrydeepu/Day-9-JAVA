import java.util.*;
public class Togglingcase{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char sc=s.next().charAt(0);
        sc^=32;
        System.out.println(sc);
    }
}