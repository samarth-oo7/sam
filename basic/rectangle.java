abstract class Inh{
    abstract public void rec(int l,int b);
    abstract public void cube(int a);

}
class rectangle extends Inh{
    public void rec(int l,int b){
        int par=(l+b)*2;
        int area=l*b;
        System.out.printf("rectangle area:%d and parameter :%d",area,par);
    }
    public void cube(int a){
        int volume =a*a*a;
        System.out.println("volume of cube:"+volume);
    
    }
    public static void main(String[] args) {
        rectangle obj=new rectangle();
        obj.rec(5, 4);
        obj.cube(5);
    }
}
    

