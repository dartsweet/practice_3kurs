public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Иван", 1000, 2),
                new Cat("Барсик", 500, 3),
                new Robot("CP-U", 2000, 1)
        };

        Obstacle[] obstacles = {
                new Treadmill(800),
                new Wall(1),
                new Treadmill(1200),
                new Wall(1)
        };

        for (Participant participant : participants) {
            System.out.println("\nУчастник " + participant.getName() + " начинает:");
            for (Obstacle obstacle : obstacles) {
                if (participant.isActive()) {
                    obstacle.overcome(participant);
                }
            }
        }
    }
}