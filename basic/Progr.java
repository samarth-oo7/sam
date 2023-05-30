//package vscode;
import java.util.Scanner;
public class Progr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your state:");
        String state=sc.next();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
     
        System.out.printf("Name:%s \nState:%s \nAge:%d",name,state,age);
        sc.close();
    
       
    }
    
}
