abstract class calc{
    abstract public void add(int x,int y);
    abstract public void mul(int a,int b);
}
class p33 extends calc {
    public void add(int x,int y){
        int sum=x+y;
        System.out.println("addition:"+sum);
    }
    public void mul(int a,int b){
        int mul=a*b;
        System.out.println("multiplication:"+mul);
    }
    public static void main(String[] args) {
        p33 obj=new p33();
        obj.add(10, 5);
        obj.mul(5, 4);

    }

}