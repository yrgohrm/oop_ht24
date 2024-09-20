public class ExerciseFour {
    public static void main(String[] args) {
        FighterRobot robotOne = new FighterRobot();
        robotOne.setName("Tornado");
        robotOne.setStrength(999);
        robotOne.setWeapon("electric hammer");

        FighterRobot robotTwo = new FighterRobot();
        robotTwo.setName("Ice Storm");
        robotTwo.setStrength(567);
        robotTwo.setWeapon("chain saw");

        fight(robotOne, robotTwo);
    }

    // the parameters robotOne and robotTwo are NOT connected by name
    // to the variables robotOne and robotTwo in main. They are associated
    // by position in the argument list when called.
    private static void fight(FighterRobot robotOne, FighterRobot robotTwo) {
        if (robotOne.getStrength() > robotTwo.getStrength()) {
            // robot one is the winner
            System.out.printf("Robot %s wins the fight with its %s!",
                robotOne.getName(), robotOne.getWeapon());
        }
        else if (robotTwo.getStrength() > robotOne.getStrength()) {
            // robot two is the winner
            System.out.printf("Robot %s wins the fight with its %s!",
                robotTwo.getName(), robotTwo.getWeapon());
        }
        else {
            // no winner
            System.out.println("No winner!");
        }
    }
}
