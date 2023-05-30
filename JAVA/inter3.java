interface A{
    public void run();
}
interface B extends A{
    public void sleep();
}
interface C extends B{
    public void eat();
}
 class inter3 implements C{
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
        inter3 obj=new inter3();
        obj.eat();
        obj.run();
        obj.sleep();
    }

 }