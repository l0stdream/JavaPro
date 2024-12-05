package homework3.part2;

public class Cat extends Participant {

    public Cat(String name, int limitRun, int limitJump) {
        super(name, limitRun, limitJump);
    }

    public void run(Obstacle obstacle) {
        System.out.println("Cat " + getName() + " is running with its paws and...");
        super.overcome(obstacle);
    }

    public void jump(Obstacle obstacle) {
        System.out.println("Cat " + getName() + " is jumping with its paws and...");
        super.overcome(obstacle);
    }

}
