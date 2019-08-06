package Inheritence_and_polimorphism;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeNoise();
        cat.makeNoise("PIDORI");
        cat.makeNoise("PIDORI", 15);
    }

    public static void doSmth(Animal anima){
        anima.makeNoise();
    }
}
