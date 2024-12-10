import java.util.*;
public class Toguplowcase{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        if((a&32)==0)
        System.out.println("uppercase");
        else
        System.out.println("lowercase");
    }
}