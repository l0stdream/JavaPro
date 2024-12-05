package homework3.part2;

public class RunningPath extends Obstacle {


    public RunningPath(int distance) {
        super(distance);
    }


    public boolean overcome(Participant participant) {
        return this.getObstacleValue() >= participant.getLimitRun();
    }
}
