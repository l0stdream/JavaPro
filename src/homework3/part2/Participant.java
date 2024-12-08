package homework3.part2;

public class Participant {
    private String name;
    private int limitRun;
    private int limitJump;

    public Participant(String name, int limitRun, int limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    public void overcome(Obstacle obstacle) {
        if (obstacle.overcome(this)) {

            System.out.println(getName() + " successfully overcame " + obstacle.getClass().getSimpleName()
                    + " at " + obstacle.getObstacleValue() + " meters.");

        } else {
            System.out.println(getName() + " failed to overcome " + obstacle.getClass().getSimpleName() + " at "
                    + obstacle.getObstacleValue() + " meters. It was overcame " + obstacle.getObstacleValue() + " meters.");
        }
    }

    public void run() {
        System.out.println(getName() + " running");
    }

    public void run(Obstacle obstacle) {
    }

    public void jump() {
        System.out.println(getName() + " jumping");
    }

    public void jump(Obstacle obstacle) {
    }

    public String getName() {
        return name;
    }

    public int getLimitRun() {
        return limitRun;
    }

    public int getLimitJump() {
        return limitJump;
    }
}
