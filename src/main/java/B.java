public class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }

    public static void main(String[]args){
        B b =new B();
        b.meth();
    }
}
