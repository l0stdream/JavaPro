package homework3.part2;

public class Robot extends Participant {

    public Robot(String name, int limitRun, int limitJump) {
        super(name, limitRun, limitJump);
    }

    public void run(Obstacle obstacle) {
        System.out.println("Robot " + getName() + " is running with its mechanical legs and...");
        super.overcome(obstacle);
    }

    public void jump(Obstacle obstacle) {
        System.out.println("Robot " + getName() + " is jumping with its mechanical legs and...");
        super.overcome(obstacle);
    }

}
