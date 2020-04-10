package SelfStudy1;

abstract class AbstractMethodTest {
    public String name = "John";
    public int age = 12;

    public abstract void Address();
}

class Student extends AbstractMethodTest {
    public int graduationYear = 2020;
    public void Address (){
        System.out.println("This is abstract method");
    }

}