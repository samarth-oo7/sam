class student{
    student(){
        String name="jay";
        int age=19;
        String course="computer engg";
        
        System.out.printf("Name:%s \nAge:%d \nCourse:%s \n",name,age,course);
    }
}

class stuInh extends student{
    stuInh(){
        int salary=70000;
        String des="programmer";

        System.out.printf("Salary:%d \nDesingnation:%s",salary,des);


    }
    public static void main(String[] args) {
        stuInh obj=new stuInh();
    }
}
