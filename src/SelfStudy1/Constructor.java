package SelfStudy1;

public class Constructor {
    String name;
    int age;

    public Constructor (String name1, int age1){
        name = name1;
        age = age1;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor("Derya", 12);
        System.out.println(obj.name + obj.age);
    }
}
