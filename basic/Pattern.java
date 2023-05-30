public class Pattern {
    void p1()
    {
        int i=1;
        while(i<=5){

            int j=1;
            while(j<=i){
                System.out.print(j);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }

    }
    public static void main(String[] args) {
        Pattern obj = new Pattern();
        obj.p1();   
    
       /*  while(i<=5){

            int j=1;
            while(j<=i){
                System.out.print(j);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }*/
    }
    
}
