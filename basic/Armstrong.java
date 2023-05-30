import java.util.Scanner;
public class Armstrong {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Eneter any numbbrer");
    int x=sc.nextInt();
    int num=0;
    int count=0;
    int cnt=0;
    int result=0;
    int mul=0;
    int rem=0;

    num=x;
    while(num>0)
    {
        num/=10;
        count++;
    }
    System.out.println("digit:"+count);

    while(x>0){
        rem=x%10;

        while(cnt>0){
            mul=mul*rem;
            cnt--;
        }
        count=cnt;
        x=x/10;
        result=result+mul;
        mul=1;
    }
    System.out.println("Num:"+result);
    sc.close();
 }    
}
