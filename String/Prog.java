package String;
import java.util.Scanner;
public class Prog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
      String str2=str.toLowerCase();
    if(str2.equals("samarth")){
        System.out.println("welcome samarth");
    } 
    else{
        System.out.println("hello");

    }
    String rep=str.replace("Samarth", "patel");
    System.out.println(rep);

    System.out.println("enter the number of index");
    int i=sc.nextInt();
    char ch=str.charAt(i);
    System.out.println(ch);
        


    }
    
}
