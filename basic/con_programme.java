import java.util.Scanner;
public class con_programme {
    con_programme(int sq){
        int square=sq*sq;
        System.out.println("Square of number is:"+square);
    }

    int sum(int a,int b){
        int sum=a+b;
        System.out.println("Adition :"+sum);
    }


    public static void main(String[] args) {
        Scanner scc=new Scanner(System.in);
        con_programme obj= new con_programme();
        
        System.out.println("enter your choice:");
        int s=sc.nextInt;
        switch(s){
            case 0:
            {
               obj.sum(3, 4);
            }
        }
        
    }
    sc.close();
}

