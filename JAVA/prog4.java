interface A{
    public void run();
}
interface B{
    public void run();

}
abstract class p1 implements A,B{
    public void run(){
        System.out.println("i am running");
    }
    
    }
    class prog4 extends p1{
        public static void main(String[] args) {
            prog4 obj=new prog4() ;
            obj.run();
                
            
    }
    }