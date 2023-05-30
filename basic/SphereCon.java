public class SphereCon {
    SphereCon(int r){
        double volume=(Math.PI*r*r*4)/3;
        System.out.println("Volume of Sphere :"+volume);
    }
    public static void main(String[] args) {
        SphereCon obj = new SphereCon(3);
    }
    
}
