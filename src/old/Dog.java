package old;

public class Dog extends Animal {
    private static int counter;
    private final String name;

    public Dog(String name) {
        this.name = name;
        counter++;
    }


    public void run(int meters) {
        if (meters <= 500 && meters > 0)
            super.run(this.name, meters);
        else
            System.out.println("Sorry, " + this.name + " can't run that much");
    }


    public void swim(int meters) {
        if (meters < 10 && meters > 0)
            super.swim(this.name, meters);
        else
            System.out.println("Sorry, " + this.name + " can't swim that much");
    }

    public static int getCounter() {
        return counter;
    }
}
