public class Cons {
    Cons(){
        System.out.println("this is constructure");
    }
    Cons(int x,int y){
        int sum=x+y;
        System.out.println("Addition of two number is"+sum);
    }
    public static void main(String[] args) {

    Cons obj1=new Cons(12,12);

    }
}
