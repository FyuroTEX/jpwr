package Inheritence_and_polimorphism;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Myav");
    }

    //Overload
    public void makeNoise(String noise){
        System.out.println(noise);
    }

    //Overload
    public void makeNoise(String noise, Integer times){
        for (int i = 0; i <= times ; i++) {
            System.out.println(noise);
        }
    }
}
