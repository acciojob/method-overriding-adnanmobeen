public class B extends A{


    public static void main(String[]args){
        B b =new B();
        System.out.println(b.meth());
    }
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}
