package homework3.part2;

public class Obstacle {
    private int obstacleValue;


    public Obstacle(int obstacleValue) {
        this.obstacleValue = obstacleValue;
    }

    public int getObstacleValue() {
        return obstacleValue;
    }

    public boolean overcome(Participant participant) {
        return false;
    }

}
