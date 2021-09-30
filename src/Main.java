public class Main {

    public static void main(String[] args) {
        TeamMember[] t1 = new TeamMember[4];
        t1[0] = new TeamMember("Igor", 26, 29.5 );
        t1[1] = new TeamMember("Nastya", 19, 24.5 );
        t1[2] = new TeamMember("Vasya", 34, 31.5 );
        t1[3] = new TeamMember("Yulya", 30, 20.5 );

        TeamMember[] t2 = new TeamMember[4];
        t2[0] = new TeamMember("Ivan",19, 35.5);
        t2[1] = new TeamMember("Alena",33, 25.5);
        t2[2] = new TeamMember("Denis",27, 28.5);
        t2[3] = new TeamMember("Sveta",30, 30.5);

        Team teamOne = new Team(t1, "Spartak");
        Team teamTwo = new Team(t2, "Zenit");
        t1[1].info();
        t2[3].info();
        Course contest = new Course();
        contest.start(teamOne);
        contest.start(teamTwo);
    }
}
