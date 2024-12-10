import java.util.*;
public class CamelCase {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String a=s.next();
    String res=" ";
    for(int i=0;i<a.length();i++){
        char sc=a.charAt(i);
        sc^=32;
        res+=sc;
    }
    System.out.println(res);
  }
}