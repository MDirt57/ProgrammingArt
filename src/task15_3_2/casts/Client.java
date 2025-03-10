package task15_3_2.casts;

public class Client {

    public static void main(String[] args) {
        Animal smt = new Animal();
        Animal cat1 = new Cat();
        Cat cat2 = (Cat) cat1;
        Tiger cat3 = (Tiger) cat1;

        Cat cat4 = new Cat();
        Animal cat5 = (Animal) cat4;

        cat1.voice();
        cat2.drinkMilk();
        cat3.eat();
        cat5.voice();
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

    }

}
