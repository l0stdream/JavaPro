package homework3.part2;

public class Wall extends Obstacle {


    public Wall(int distance) {
        super(distance);
    }


    public boolean overcome(Participant participant) {
        return this.getObstacleValue() >= participant.getLimitJump();
    }

}


