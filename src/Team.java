public class Team {
    String teamName;
    TeamMember[] team;

    public Team(TeamMember[] team, String teamName) {
        this.team = team;
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public TeamMember[] getTeam() {
        return team;
    }
}