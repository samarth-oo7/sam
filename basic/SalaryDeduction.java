import java.util.Scanner;
public class SalaryDeduction {
  /*  SalaryDeduction(int x){
        
        double hra=(10*x)/100;
        double da=(5*x)/100;
        double pf=(3*x)/100;
          double  ctc=x-hra-da-pf;

        System.out.println("your pf cut is:"+pf);
        System.out.println("your da  cut is:"+da);
        System.out.println("your hra  cut is:"+hra);
        System.out.println("your ctc Salary is:"+ctc);*/

void tax(double ctc)
{
        if (ctc<=500000){
            System.out.println("tax below 500k is zero ");
        }

       else if(ctc>500000&&ctc<10000000){
            double tax1=(10*ctc)/100;
            System.out.println("your tax is:"+tax1);
        }
       else if(ctc>1000000&&ctc<20000000){
            double tax2=(20*ctc)/100;
            System.out.println("your tax is:"+tax2);
        }
        else 
          {  double tax3=(30*ctc)/100;
            System.out.println("your tax is:"+tax3);
        }
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Salary:");
        int x=sc.nextInt();
        double hra=(10*x)/100;
        double da=(5*x)/100;
        double pf=(3*x)/100;
          double  ctcs=x-hra-da-pf;

        System.out.println("your pf cut is:"+pf);
        System.out.println("your da  cut is:"+da);
        System.out.println("your hra  cut is:"+hra);
        System.out.println("your ctc Salary is:"+ctcs);


     //    SalaryDeduction obj= new SalaryDeduction(salary);
         SalaryDeduction obj2=new SalaryDeduction();
         obj2.tax(ctcs);
         sc.close();
        

    }
    
}
