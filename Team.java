public class Team {

    private String teamName;
    private int numberOfMembers;
    private int skill;
    private Members[] membersTeam;

    public Team(String name, int number, int obst) {
        this.teamName = name;
        this.numberOfMembers = number;
        this.skill = obst;


    }

    public void teamBuild() {
        membersTeam = new Members[numberOfMembers];
        for (int i = 0; i < 4; i++ ) {
            membersTeam[0] = new Members(5);
        }
    }



}
