abstract class Inh {
    public abstract void rectangle(int l,int b);
    public abstract void cube(int a);
    
}
class area_volume extends Inh{
    public void rectangle(int l,int b){
        int par=(l+b)*2;
        int area=l*b;
        System.out.printf("rectangle parameter: %d \n rectangle area:%d \n",par,area);
    }
    public void cude(int a){
        int volume=a*a*a;
        System.out.println("volume of cube :"+volume);

    }
    public static void main(String[] args) {
        area_volume obj=new area_volume();
        obj.rectangle(5, 5);
        obj.cube(4);
    }
    @Override
    public void cube(int a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cube'");
    }
   

}
