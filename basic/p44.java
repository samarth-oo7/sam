abstract class Inh{
    public  void abs() {
        System.out.println("This is abstract class");    
    }
}
class p44 extends Inh{
    public static void main(String[] args) {
        p44 obj=new p44();
        System.out.println("this is inherited class");
        obj.abs();
    }

}
    

