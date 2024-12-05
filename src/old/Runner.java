package old;

public class Runner {
    public static void main(String[] args) {
        Dog bobik = new Dog("bobik");
        Dog bobik2 = new Dog("bobik2");
        Cat kitty = new Cat("kitty");

        bobik.run(15);
        bobik2.run(500);
        bobik.run(501);
        bobik.run(-1);
        bobik2.run(10);
        bobik.swim(124);
        bobik.swim(-124);
        bobik.swim(0);

        kitty.run(1234);
        kitty.run(201);
        kitty.swim(124);
        kitty.run(1234);
        kitty.run(201);
        kitty.run(77);
        kitty.swim(124);

        count();
    }

    private static void count() {
        int tmpdog = Dog.getCounter();
        int tmpcat = Cat.getCounter();
        System.out.println("You created " + tmpcat + tmpdog + " animals, " + tmpcat + " of which were cats and " + tmpdog + " were dogs");
    }

    ;
}
