import java.util.Scanner;
public class checkstart {
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
   System.out.println("enrter the first string:");
    String str1 =sc.next();
 
    System.out.println("enrter the another string:");
    String s2=sc.next();
       
        
       if (str1.startsWith(s2)) {
          System.out.println("str1 starts with str2.");
      } else {
        System.out.println("str1 does not start with str2.");
      }
    } 
    
}
