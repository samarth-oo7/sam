package String;

public class Endswith {
    public static void main(String[] args) {
        String str = "Welcome to Javaworld";  
        System.out.println(str.endsWith("Javaworld"));  
        if(str.endsWith(" world")) {  
            System.out.println("String ends with world");  
        }else System.out.println("It does not end with world");  
    }
    
}
