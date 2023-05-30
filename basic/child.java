class parent1{
    parent1(){
        System.out.println("this is parent1 class");
    }
}
class parent2{
    parent2(){
        System.out.println("this is parent2 class ");
    }
}

 class child extends parent1 , parent2 {
    child(){
        System.out.println("this is child class");
    }
    public static void main(String[] args) {
        child obj=new child();
    }
    
}

