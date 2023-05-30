import java.util.Scanner;

public class area_cir {
   
    public static void main(String[] args){
      /*  Scanner sc=new Scanner(System.in);
    
        System.out.println( "enert the radius of circle::");
        float r=sc.nextInt();
       //  double pi=3.14f;
      
         double are=3.14*r*r;
        System.out.println("area of circle is :"+are);
        sc.close();*/
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your city:");
        String city=sc.next();
        System.out.println("Enter your state:");
        String state=sc.next();
        System.out.println("Enter your course:");
        String course=sc.next();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
       
        System.out.printf("name : %s \n city :%s \n State :%s \n course %s \n age: %d ",name,city,state,course,age);
        sc.close();
    }
    
}

    


