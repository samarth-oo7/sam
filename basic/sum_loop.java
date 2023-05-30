import java.util.Scanner;
public class sum_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
       for(int i=1;i<=3;i++) {
            System.out.println("Enter the number:"+i);
            int a=sc.nextInt();
            int sum=0;
            sum=sum+a;  

        }
       String sum;
        //2
        System.out.print("result:"+sum);
       
        sc.close();
        
    }
    
}
