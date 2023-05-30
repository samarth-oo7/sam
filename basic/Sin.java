import java.util.Scanner;

public class Sin {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter value of degree:");
        double x = sc.nextInt();
        double y=Math.toRadians(x);
        double res= Math.sin(y);
        System.out.println("sin vale:"+res);
        sc.close();


    }
}
