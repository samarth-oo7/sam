import java.util.Scanner;
public class area {
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        System.out.println("enter radius of circle:");
        int r=sc.nextInt();
        double pi=3.14;
        double area=pi*r*r;
        System.out.println("area of circle :"+area)  ;
        sc.close();
}
}