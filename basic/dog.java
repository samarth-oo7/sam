class animal{
    animal(){
        System.out.println("this is animal class");

    }
    int area(int r){
        int arr=r*r;
        System.out.println(arr);
    }
}

class dog extends animal{
    dog(){
        System.out.println("This is dog class");
    }
    public static void main(String[] args) {
        dog obj=new dog();
        dog obj2=new dog();
        obj2.area(3);
    }
}