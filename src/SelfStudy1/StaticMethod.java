package SelfStudy1;

public class StaticMethod {
    static void staticMethod (){
        System.out.println("Static Method");
    }
    public void publicMethod (){
        System.out.println("Public Method");
    }

    public static void main(String[] args) {
        staticMethod();

        StaticMethod obj = new StaticMethod();
        obj.publicMethod();
    }
}
