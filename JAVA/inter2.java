

interface A{
    public void run();
}
interface B{
    public void sleep();
}
interface C{
    public void eat();
}
class inter2 implements A,B,C{
    public void run(){
        System.out.println("i am runing");
    }
    public void sleep(){
        System.out.println("i am sleepping");
    }
    public void eat(){
        System.out.println("i am eating");
    }
    public static void main(String[] args) {
        inter2 obj=new inter2();
        obj.eat();
        obj.sleep();
    }
}