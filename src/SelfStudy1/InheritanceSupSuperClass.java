package SelfStudy1;

class InheritanceSupSuperClass {
    protected String fatherName = "Jorge"; //Protected to access subclasses
    int fatherAge = 56;                     //default can also be used
    public void MyMethod (){                // public can also be used
        System.out.println("This is a Method");
    }

}
class Son extends InheritanceSupSuperClass {
    public String name = "Ali";


    public static void main(String[] args) {
        Son obj = new Son();
        obj.MyMethod();
        System.out.println("My name: " + obj.name + "\nMy father Name : " + obj.fatherName + "\nMy Father's age: " + obj.fatherAge);
    }
}
