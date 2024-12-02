public class Cat extends Animal {
    private static int counter;
    private final String name;

    public Cat(String name) {
        this.name = name;
        counter++;
    }


    public void run(int meters) {
        if (meters <= 200 && meters > 0)
            super.run(this.name, meters);
        else
            System.out.println("Sorry, " + this.name + " can't run that much");
    }

    public void swim(int meters) {
        System.out.println("Sorry, cats can't swim");
    }

    public static int getCounter() {
        return counter;
    }
}
