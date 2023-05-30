class animal {
    animal(){
        System.out.println("this is animal class");
    }
    
}
class dog extends animal{
    dog()
{
    System.out.println("this is dog class");
}
}

class petdog extends dog{
    petdog(){
   System.out.println("this is petdog class");
    }
    public static void main(String[] args) {
        petdog obj=new petdog();
    }
}
