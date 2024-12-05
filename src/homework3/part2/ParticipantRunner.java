package homework3.part2;

public class ParticipantRunner {
    public static void main(String[] args) {
        Obstacle obstacle = new RunningPath(15);
        Wall wall = new Wall(15);
        Cat cat = new Cat("Kitty", 151, 10);
        Robot robot = new Robot("Mario", 141, 15);
        Human human = new Human("Person", 15, 14);
        //       robot.run(wall);
        //       robot.run();
//        robot.jump();
//        robot.jump(obstacle);
//        robot.run(wall);
//        robot.run(obstacle);
//        robot.jump(obstacle);
//       cat.jump(wall);

        Participant[] participants = new Participant[5];
        participants[0] = robot;
        participants[1] = human;
        participants[2] = cat;
        participants[3] = human;
        participants[4] = cat;

        Obstacle[] obstacles = new Obstacle[4];
        obstacles[0] = wall;
        obstacles[1] = obstacle;
        obstacles[2] = wall;
        obstacles[3] = new Obstacle(14);

        test(participants, obstacles);
    }

    public static void test(Participant[] participants, Obstacle[] obstacles) {
        for (int i = 0; i < participants.length; i++) {
            Participant currentParticipant = participants[i];
            System.out.println("Participant N: " + (i + 1) + ", " + currentParticipant.getClass().getSimpleName() + " " + currentParticipant.getName());
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Wall) {
                    if (!obstacle.overcome(currentParticipant))
                        break;
                    currentParticipant.jump(obstacle);
                } else if (obstacle instanceof RunningPath) {
                    if (!obstacle.overcome(currentParticipant))
                        break;
                    currentParticipant.run(obstacle);
                } else
                    System.out.println("Sry there wasn't any obstacles.");
            }
        }
    }
}
