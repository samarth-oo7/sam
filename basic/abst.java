abstract class Inh {
    public void add(int x,int y){
        int sum=x+y;
        System.out.println(sum);
    }
    public abstract void sleep();
    
}
class abst extends Inh {
    public void sleep()
    {
        System.out.println("i am sleeping");

    }
    public static void main(String[] args) {
        abst obj=new abst();
        obj.sleep();
        
    }
}
