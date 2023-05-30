public class method {
    method(char c,int n){
        System.out.printf("char:%c int:%d \n",c,n);
    }
    method(int n,char c){
        System.out.printf("char:%c int:%d",c,n);
    }
    public static void main(String[] args) {
        int a=10;
        char b='a';
        method obj=new method(a, b);
        method obj1=new method(b, a);
    }
}
