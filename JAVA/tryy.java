interface A{
    public void pp1();
}
 abstract class p1 implements A{
    public void pp1(){
        System.out.println("this is parent one class");

    }
}
interface B extends A{
    public void pp2();
}
interface C extends B{
    public void child();
}

  abstract class p2 implements B{
    public void pp2(){
    System.out.println("this is second parent class");
    }
}
class tryy implements C{
    public void child(){
        System.out.println("this is child class");
    }
    public static void main(String[] args) {
        tryy obj=new tryy();
        obj.child();
        obj.pp1();
        obj.pp2();
    }
}