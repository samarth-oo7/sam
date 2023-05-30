import java.util.Scanner;
public class AreaCircle_con {
    AreaCircle_con(int r){
        double area=Math.PI*r*r;
        System.out.println("area of circle is:"+area);
    }

    AreaCircle_con(int h,int b){
        double tri=h*b*0.5;
        System.out.println("Area of triangle is:"+tri);
    }
    

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

     System.out.println("enter radius of circle:");
     int ra=sc.nextInt();


        final AreaCircle_con obj=new AreaCircle_con(ra);
        AreaCircle_con var=new AreaCircle_con(10, 5);
    }
    
}
