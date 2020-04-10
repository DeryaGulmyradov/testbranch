package SelfStudy1;

class PolymorphismAnimal {
    public void AnimalSound () {
        System.out.println("Animal makes sound");
    }
}
class Pig extends PolymorphismAnimal {
    public void AnimalSound (){
        System.out.println("Pig makes wee wee");
    }
}
class Cat extends PolymorphismAnimal {
    public void AnimalSound (){
        System.out.println("Cat makes mew mew");
    }
}
class MainClass {
    public static void main(String[] args) {
        PolymorphismAnimal MyAnimal = new PolymorphismAnimal();
        PolymorphismAnimal MyPig = new Pig();
        PolymorphismAnimal MyCat = new Cat();

        MyAnimal.AnimalSound();
        MyPig.AnimalSound();
        MyCat.AnimalSound();
    }
}