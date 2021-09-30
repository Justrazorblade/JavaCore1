public class Course {

    public int[] course = {500, 400, 300, 200};

    public void start(Team team) {
        double result;
        double teamResult = 0;
        for (int i = 0; i < course.length; i++) {
            for (int j = 0; j < team.getTeam().length; j++) {
                result = course[i]/team.getTeam()[j].getSpeed();
                System.out.println("Team: " + team.getTeamName() + " course "+ (i +1) + " - Result of " + team.getTeam()[j].getName() + " is " + result);
                teamResult += result;
            }
        }
        System.out.println("Result of Team " + team.getTeamName() + " is " + teamResult);
    }
}
