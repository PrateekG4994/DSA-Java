class Animal
{
    public void makeSound(){
        System.out.println("The Animal make a Sound");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("The Cat Quarrels");
    }
}
public class makeSound {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}
