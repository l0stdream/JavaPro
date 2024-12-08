package homework3.part2;

public class Human extends Participant {

    public Human(String name, int limitRun, int limitJump) {
        super(name, limitRun, limitJump);
    }

    public void run(Obstacle obstacle) {
        System.out.println("Human " + getName() + " is running with his legs and...");
        super.overcome(obstacle);
    }

    public void jump(Obstacle obstacle) {
        System.out.println("Human " + getName() + " is jumping with his legs and...");
        super.overcome(obstacle);
    }
}
