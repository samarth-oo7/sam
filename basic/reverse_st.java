public class reverse_st {
    public static void main(String[] args) {
        String str="jayaa";
       String nstr="";
       char ch;
         for(int i=0;i<=str.length();i++){
           ch=str.charAt(i);
          nstr=ch+nstr;
        }
        System.out.println("revers string:"+nstr);
    }
}
