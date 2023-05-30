import java.util.Scanner; 
public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
    
        System.out.println("enter your gender");
        String str=sc.next();
        String str2=str.toLowerCase();
        int per=0;

        if(str.equals("male")){
            System.out.println("enter your age:");
            int age=sc.nextInt();
            
            if(age<=26){
                   per=26;
            }
            else{
                   per=9;
            }
        }

        else if (str2.equals("female")){
            System.out.println("do you like sport(yes/no)");
            String spo=sc.next();
            String spo2=spo.toLowerCase();
            
            if(spo2=="yes"){               
                 per=21;
            }
            else{
                 per=10;
            }           
        }
    else {
            System.out.println("eneter your answer properly");
        }
        System.out.println("enter the product price:");
        int price=sc.nextInt();

        int dis=(price*per)/100;
        int finalp=price-dis;
        System.out.println("your deducted price is:"+finalp);
        

    
        sc.close();
    }
    
}
